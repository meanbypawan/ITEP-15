import { Component } from "react";

class NewsLetter extends Component{
    render(){
        return <>
           <div className="container-fluid bg-primary py-5 my-5">
        <div className="container py-5">
            <div className="row justify-content-center">
                <div className="col-lg-7 text-center wow fadeIn" data-wow-delay="0.2s">
                    <h1 className="text-white mb-5">Subscribe the <span className="text-uppercase bg-white text-primary rounded px-2">Newsletter</span></h1>
                    <div className="position-relative w-100 mb-2">
                        <input className="form-control border-0 w-100 ps-4 pe-5" type="text"
                            placeholder="Enter Your Email" style={{"height": "60px"}}/>
                        <button type="button" className="btn shadow-none position-absolute top-0 end-0 mt-2 me-2"><i
                                className="fa fa-paper-plane text-primary fs-4"></i></button>
                    </div>
                    <p className="text-secondary mb-0">Diam sed sed dolor stet amet eirmod</p>
                </div>
            </div>
        </div>
    </div>
        </>
    }
}
export default NewsLetter;