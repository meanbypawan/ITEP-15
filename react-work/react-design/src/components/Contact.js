import { Component } from "react";

class Contact extends Component {
    render() {
        return <>
            <div className="container-fluid py-5">
                <div className="container">
                    <div className="text-center wow fadeIn" data-wow-delay="0.1s">
                        <h1 className="mb-5"><span className="text-uppercase bg-primary text-white rounded px-2">Contact</span> Have Any Query?</h1>
                    </div>
                    <div className="row justify-content-center">
                        <div className="col-lg-7">
                            <div className="wow fadeIn" data-wow-delay="0.2s">
                                <h4 className="text-center mb-4">Receive messages instantly with our PHP and Ajax contact form - available in the <a href="https://htmlcodex.com/downloading/?item=3811">Pro Version</a> only.</h4>
                                <form>
                                    <div className="row">
                                        <div className="col-sm-6 mb-3">
                                            <div className="form-floating">
                                                <input type="text" className="form-control" id="name" placeholder="Your Name" />
                                                <label for="name">Your Name</label>
                                            </div>
                                        </div>
                                        <div className="col-sm-6 mb-3">
                                            <div className="form-floating">
                                                <input type="email" className="form-control" id="email" placeholder="Your Email" />
                                                <label for="email">Your Email</label>
                                            </div>
                                        </div>
                                        <div className="col-sm-6 mb-3">
                                            <div className="form-floating">
                                                <input type="text" className="form-control" id="mobile" placeholder="Mobile" />
                                                <label for="mobile">Mobile</label>
                                            </div>
                                        </div>
                                        <div className="col-sm-6 mb-3">
                                            <div className="form-floating">
                                                <input type="text" className="form-control" id="subject" placeholder="Subject" />
                                                <label for="subject">Subject</label>
                                            </div>
                                        </div>
                                        <div className="col-12 mb-3">
                                            <div className="form-floating">
                                                <textarea style={{"height": "165px"}} className="form-control" id="message" placeholder="Message"></textarea>
                                                <label for="message">Leave a message here</label>
                                            </div>
                                        </div>
                                        <div className="col-12">
                                            <button className="btn btn-primary w-100 py-3" type="submit"><span>Send Message</span></button>
                                        </div>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </div>

        </>
    }
}
export default Contact;