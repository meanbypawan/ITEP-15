import { Component } from "react";

class Header extends Component {
    render() {
        return <>
            <div className="container-fluid sticky-top">
                <div className="container">
                    <nav className="navbar navbar-expand-lg navbar-light">
                        <a href="index.html" className="navbar-brand">
                            <h1>SEOcom</h1>
                        </a>
                        <button type="button" className="navbar-toggler ms-auto me-0" data-bs-toggle="collapse"
                            data-bs-target="#navbarCollapse">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarCollapse">
                            <div className="navbar-nav mx-auto">
                                <a href="index.html" className="nav-item nav-link active">Home</a>
                                <a href="about.html" className="nav-item nav-link">About</a>
                                <a href="service.html" className="nav-item nav-link">Services</a>
                                <a href="contact.html" className="nav-item nav-link">Contact</a>
                            </div>
                            <a className="btn btn-secondary px-3" href="https://htmlcodex.com/downloading/?item=3811">Buy Pro Version</a>
                        </div>
                    </nav>
                </div>
            </div>
        </>
    }
}
export default Header;