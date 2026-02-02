import { Component } from "react";

class Counter extends Component{
    constructor(){
      super();
      this.state = {
        counter: 100,
        evenCounter: 0
      };
    }
    incrementCounter = ()=>{
      this.setState({counter: this.state.counter+1});
      console.log(this.state.counter);
    }
    incrementEvenCounter = ()=>{
      this.setState({evenCounter:this.state.evenCounter + 2});
    }
    render(){
        console.log("render-called....");
        return <>
          <h2>Counter Component...</h2>
          <hr/>
          <button onClick={this.incrementCounter}>Counter value : {this.state.counter}</button>
          <button onClick={this.incrementEvenCounter}>Even Counter : {this.state.evenCounter}</button>
        </>
    }
}
export default Counter;