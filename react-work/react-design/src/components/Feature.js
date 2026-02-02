import { Component } from "react";

class Feature extends Component{
    render(){
        return <>
          <div className="container-fluid bg-primary py-5 my-5">
        <div className="container py-5">
            <div className="row g-5">
                <div className="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.1s">
                    <div className="d-flex align-items-center">
                        <div className="flex-shrink-0 btn-lg-square bg-secondary rounded me-3">
                            <i className="fa fa-trophy text-white"></i>
                        </div>
                        <p className="fs-5 text-white mb-0">Award Winning</p>
                    </div>
                </div>
                <div className="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.3s">
                    <div className="d-flex align-items-center">
                        <div className="flex-shrink-0 btn-lg-square bg-secondary rounded me-3">
                            <i className="fa fa-users text-white"></i>
                        </div>
                        <p className="fs-5 text-white mb-0">Professional Staff</p>
                    </div>
                </div>
                <div className="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.5s">
                    <div className="d-flex align-items-center">
                        <div className="flex-shrink-0 btn-lg-square bg-secondary rounded me-3">
                            <i className="fa fa-headset text-white"></i>
                        </div>
                        <p className="fs-5 text-white mb-0">24/7 Support</p>
                    </div>
                </div>
                <div className="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.7s">
                    <div className="d-flex align-items-center">
                        <div className="flex-shrink-0 btn-lg-square bg-secondary rounded me-3">
                            <i className="fa fa-money-bill-wave text-white"></i>
                        </div>
                        <p className="fs-5 text-white mb-0">Fair Prices</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
        </>
    }
}
export default Feature;