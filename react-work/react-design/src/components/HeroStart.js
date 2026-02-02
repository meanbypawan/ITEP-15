import { Component } from "react";

class HeroStart extends Component {
    render() {
        return <>
            <div className="container-fluid pb-5 hero-header mb-5">
                <div className="container py-5">
                    <div className="row g-5 align-items-center">
                        <div className="col-lg-6">
                            <h1 className="display-3 mb-4 animated slideInRight">All in One <span className="text-white">SEO TOOL</span> Need to Grow Your Business Rapidly</h1>
                            <p className="fs-5 d-inline-block rounded bg-primary text-white py-3 px-4 mb-0 animated slideInRight">
                                An Award Winning Agency Since 1990</p>
                        </div>
                        <div className="col-lg-6">
                            <img className="img-fluid animated slideInRight" src="img/hero-header.png" alt="" />
                        </div>
                    </div>
                </div>
            </div>
        </>
    }
}

export default HeroStart;