import { Component } from "react";

class About extends Component{
    render(){
        return <>
          <div className="container-fluid py-5">
        <div className="container">
            <div className="row g-5 align-items-center">
                <div className="col-lg-6 wow fadeIn" data-wow-delay="0.2s">
                    <img className="img-fluid" src="img/about.png" alt=""/>
                </div>
                <div className="col-lg-6 wow fadeIn" data-wow-delay="0.5s">
                    <h1 className="mb-4"><span className="text-uppercase bg-primary text-white rounded px-2">About</span> The Best SEO Solution With 10 Years of Experience</h1>
                    <p className="mb-4">Tempor erat elitr rebum at clita. Diam dolor diam ipsum et tempor sit. Aliqu diam
                        amet diam et eos labore. Clita erat ipsum et lorem et sit, sed stet no labore lorem sit. Sanctus
                        clita duo justo et tempor eirmod magna dolore erat amet</p>
                    <p className="mb-4">Aliqu diam amet diam et eos labore. Clita erat ipsum et lorem et sit, sed stet no
                        labore lorem sit. Sanctus clita duo justo et tempor.</p>
                    <div className="row g-3">
                        <div className="col-sm-6">
                            <h6 className="mb-3"><i className="fa fa-check text-primary me-2"></i>Award Winning</h6>
                            <h6 className="mb-0"><i className="fa fa-check text-primary me-2"></i>Professional Staff</h6>
                        </div>
                        <div className="col-sm-6">
                            <h6 className="mb-3"><i className="fa fa-check text-primary me-2"></i>24/7 Support</h6>
                            <h6 className="mb-0"><i className="fa fa-check text-primary me-2"></i>Fair Prices</h6>
                        </div>
                    </div>
                    <div className="d-flex align-items-center mt-4">
                        <a className="btn btn-primary py-3 px-4 me-2" href="">Read More</a>
                        <a className="btn btn-secondary btn-square me-2" href=""><i className="fab fa-facebook-f"></i></a>
                        <a className="btn btn-secondary btn-square me-2" href=""><i className="fab fa-twitter"></i></a>
                        <a className="btn btn-secondary btn-square me-2" href=""><i className="fab fa-instagram"></i></a>
                        <a className="btn btn-secondary btn-square" href=""><i className="fab fa-linkedin-in"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </div>

        </>
    }
}
export default About;