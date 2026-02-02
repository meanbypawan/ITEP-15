import { Component } from "react";

class Service extends Component{
    render(){
        return <>
          <div className="container-fluid py-5">
        <div className="container">
            <div className="text-center wow fadeIn" data-wow-delay="0.1s">
                <h1 className="mb-5"><span className="text-uppercase bg-primary text-white rounded px-2">Services</span> What Solutions We Provide</h1>
            </div>
            <div className="row g-4 justify-content-center">
                <div className="col-lg-4 col-md-6 wow fadeIn" data-wow-delay="0.1s">
                    <div className="service-item h-100 p-5 pt-0">
                        <div className="d-flex align-items-center ms-n5 mb-4">
                            <div className="service-icon flex-shrink-0 bg-primary me-4">
                                <i className="fa fa-chart-line fa-3x text-white"></i>
                            </div>
                            <h4 className="mb-0">SEO Optimization</h4>
                        </div>
                        <p className="mb-4">Clita erat ipsum et lorem et sit, sed stet no labore lorem sit. Sanctus clita duo justo et tempor eirmod magna</p>
                        <a className="btn btn-secondary px-3" href="">Read More</a>
                    </div>
                </div>
                <div className="col-lg-4 col-md-6 wow fadeIn" data-wow-delay="0.3s">
                    <div className="service-item h-100 p-5 pt-0">
                        <div className="d-flex align-items-center ms-n5 mb-4">
                            <div className="service-icon flex-shrink-0 bg-primary me-4">
                                <i className="fa fa-laptop-code fa-3x text-white"></i>
                            </div>
                            <h4 className="mb-0">Web Design</h4>
                        </div>
                        <p className="mb-4">Clita erat ipsum et lorem et sit, sed stet no labore lorem sit. Sanctus clita duo justo et tempor eirmod magna</p>
                        <a className="btn btn-secondary px-3" href="">Read More</a>
                    </div>
                </div>
                <div className="col-lg-4 col-md-6 wow fadeIn" data-wow-delay="0.5s">
                    <div className="service-item h-100 p-5 pt-0">
                        <div className="d-flex align-items-center ms-n5 mb-4">
                            <div className="service-icon flex-shrink-0 bg-primary me-4">
                                <i className="fa fa-share-alt fa-3x text-white"></i>
                            </div>
                            <h4 className="mb-0">Social Marketing</h4>
                        </div>
                        <p className="mb-4">Clita erat ipsum et lorem et sit, sed stet no labore lorem sit. Sanctus clita duo justo et tempor eirmod magna</p>
                        <a className="btn btn-secondary px-3" href="">Read More</a>
                    </div>
                </div>
                <div className="col-lg-4 col-md-6 wow fadeIn" data-wow-delay="0.1s">
                    <div className="service-item h-100 p-5 pt-0">
                        <div className="d-flex align-items-center ms-n5 mb-4">
                            <div className="service-icon flex-shrink-0 bg-primary me-4">
                                <i className="fa fa-envelope-open-text fa-3x text-white"></i>
                            </div>
                            <h4 className="mb-0">Email Marketing</h4>
                        </div>
                        <p className="mb-4">Clita erat ipsum et lorem et sit, sed stet no labore lorem sit. Sanctus clita duo justo et tempor eirmod magna</p>
                        <a className="btn btn-secondary px-3" href="">Read More</a>
                    </div>
                </div>
                <div className="col-lg-4 col-md-6 wow fadeIn" data-wow-delay="0.3s">
                    <div className="service-item h-100 p-5 pt-0">
                        <div className="d-flex align-items-center ms-n5 mb-4">
                            <div className="service-icon flex-shrink-0 bg-primary me-4">
                                <i className="fa fa-mouse-pointer fa-3x text-white"></i>
                            </div>
                            <h4 className="mb-0">PPC Advertising</h4>
                        </div>
                        <p className="mb-4">Clita erat ipsum et lorem et sit, sed stet no labore lorem sit. Sanctus clita duo justo et tempor eirmod magna</p>
                        <a className="btn btn-secondary px-3" href="">Read More</a>
                    </div>
                </div>
                <div className="col-lg-4 col-md-6 wow fadeIn" data-wow-delay="0.5s">
                    <div className="service-item h-100 p-5 pt-0">
                        <div className="d-flex align-items-center ms-n5 mb-4">
                            <div className="service-icon flex-shrink-0 bg-primary me-4">
                                <i className="fa fa-mobile-alt fa-3x text-white"></i>
                            </div>
                            <h4 className="mb-0">App Development</h4>
                        </div>
                        <p className="mb-4">Clita erat ipsum et lorem et sit, sed stet no labore lorem sit. Sanctus clita duo justo et tempor eirmod magna</p>
                        <a className="btn btn-secondary px-3" href="">Read More</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
        </>
    }
}

export default Service;