import { Component } from "react";
import Header from "./components/Header";
import HeroStart from "./components/HeroStart";
import About from "./components/About";
import Feature from "./components/Feature";
import Service from "./components/Service";
import NewsLetter from "./components/NewsLetter";
import Contact from "./components/Contact";
import Footer from "./components/Footer";

class App extends Component{
  render(){
    return <>
         <Header/>
         <HeroStart/>
         <About/>
         <Feature/>
         <Service/>
         <NewsLetter/>
         <Contact/>
         <Footer/>
    </>
  }
}

export default App;