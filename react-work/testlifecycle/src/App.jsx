import { Component } from "react";
import First from "./First";
class App extends Component{
  constructor(){
    super();
    this.state = {
      counter:100
    }
    console.log("Consturctor called...");
  }
  changeCounter = ()=>{
    //this.state.counter = this.state.counter + 1;
    //this.forceUpdate();
    this.setState({counter: this.state.counter+1});
  }
  render(){
    console.log("App Render called....");
    return <>
      <h1>App component..</h1>
      <button onClick={this.changeCounter}>Counter : {this.state.counter}</button>
      <hr/>
      <First message={{m1:"Hello First"}}/>
    </>
  }
  // shouldComponentUpdate(nextProps,nextState){
  //   if(nextState.counter%2==0)
  //     return true
  //   return false;
  // }
  componentDidMount(){
    console.log("ComponentDidMount() executed...");
  }
  componentDidUpdate(){
    console.log("Component Did Update exceuted....");
  }
  componentWillUnmount(){
    console.log("ComponentWillUnmount executed...");
  }
}
export default App;