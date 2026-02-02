import { Component } from "react";
import DataBinding from "./components/DataBinding";
import Counter from "./components/Counter";

class App extends Component{
  render(){
    return <>
      <h1>App component...</h1>
      {/* <DataBinding/> */}
      <Counter/>
    </>
  }
}
export default App;