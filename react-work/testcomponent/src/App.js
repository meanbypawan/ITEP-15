import { Component } from "react";
import Header from "./components/Header";
import Main from "./components/Main";
import Footer from "./components/Footer";
class App extends Component{
  render(){
    return <>
       <h1>App component...</h1>
       <Header/>
       <Main/>
       <Footer/>
    </>
  }
}
export default App;