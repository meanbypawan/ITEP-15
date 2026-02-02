import { Component } from "react";

class Footer extends Component{
    render(){
        return <>
           <div className="container-fluid bg-secondary text-white-50 footer pt-5 mt-5">
        <div className="container py-5">
            <div className="row g-5">
                <div className="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.1s">
                    <a href="index.html" className="d-inline-block mb-3">
                        <h1 className="text-white">SEOcom</h1>
                    </a>
                    <p className="mb-0">Tempor erat elitr rebum at clita. Diam dolor diam ipsum et tempor sit. Aliqu diam
                        amet diam et eos labore. Clita erat ipsum et lorem et sit, sed stet no labore lorem sit. Sanctus
                        clita duo justo et tempor</p>
                </div>
                <div className="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.3s">
                    <h4 className="text-white mb-4">Get In Touch</h4>
                    <p><i className="fa fa-map-marker-alt me-3"></i>123 Street, New York, USA</p>
                    <p><i className="fa fa-phone-alt me-3"></i>+012 345 67890</p>
                    <p><i className="fa fa-envelope me-3"></i>info@example.com</p>
                    <div className="d-flex pt-2">
                        <a className="btn btn-primary btn-square me-2" href=""><i className="fab fa-twitter"></i></a>
                        <a className="btn btn-primary btn-square me-2" href=""><i className="fab fa-facebook-f"></i></a>
                        <a className="btn btn-primary btn-square me-2" href=""><i className="fab fa-youtube"></i></a>
                        <a className="btn btn-primary btn-square me-2" href=""><i className="fab fa-instagram"></i></a>
                        <a className="btn btn-primary btn-square me-2" href=""><i className="fab fa-linkedin-in"></i></a>
                    </div>
                </div>
                <div className="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.5s">
                    <h4 className="text-white mb-4">Popular Link</h4>
                    <a className="btn btn-link" href="">About Us</a>
                    <a className="btn btn-link" href="">Contact Us</a>
                    <a className="btn btn-link" href="">Privacy Policy</a>
                    <a className="btn btn-link" href="">Terms & Condition</a>
                    <a className="btn btn-link" href="">Career</a>
                </div>
                <div className="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.7s">
                    <h4 className="text-white mb-4">Project Gallery</h4>
                    <div className="row g-2">
                        <div className="col-4">
                            <img className="img-fluid rounded w-100" src="img/project-1.jpg" alt=""/>
                        </div>
                        <div className="col-4">
                            <img className="img-fluid rounded w-100" src="img/project-2.jpg" alt=""/>
                        </div> 
                        <div className="col-4">
                            <img className="img-fluid rounded w-100" src="img/project-3.jpg" alt=""/>
                        </div> 
                        <div className="col-4">
                            <img className="img-fluid rounded w-100" src="img/project-4.jpg" alt=""/>
                        </div> 
                        <div className="col-4">
                            <img className="img-fluid rounded w-100" src="img/project-5.jpg" alt=""/>
                        </div> 
                        <div className="col-4">
                            <img className="img-fluid rounded w-100" src="img/project-6.jpg" alt=""/>
                        </div> 
                    </div>
                </div>
            </div>
        </div>
        <div className="container wow fadeIn" data-wow-delay="0.1s">
            <div className="copyright">
                <div className="row">
                    <div className="col-md-6 text-center text-md-start mb-3 mb-md-0">
                        &copy; <a className="border-bottom" href="#">Your Site Name</a>, All Right Reserved. 
                        
                        Designed By <a className="border-bottom" href="https://htmlcodex.com">HTML Codex</a>
                    </div>
                    <div className="col-md-6 text-center text-md-end">
                        <div className="footer-menu">
                            <a href="">Home</a>
                            <a href="">Cookies</a>
                            <a href="">Help</a>
                            <a href="">FAQs</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
 
        </>
    }
}

export default Footer;