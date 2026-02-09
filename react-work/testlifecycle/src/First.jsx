import { Component, PureComponent } from "react";

class First extends PureComponent{
    constructor(){
        super();
    }
    render(){
        console.log(this.props)
        console.log("First render...");
        return <>
           <h1>First Component.{this.props.message.m1}</h1>
        </>
    }
}
export default First;