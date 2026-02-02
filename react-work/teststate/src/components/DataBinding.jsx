import { Component } from "react";

class DataBinding extends Component {
    render() {
        let name = "Cheeku";
        let age = 40;
        let address = "indore, mp";
        let fruitList = ["Mango", "Cheeku", "Banana", "Graphes", "Apple"]

        return <>
            <h1>Data Binding Demo..</h1>
            <h3>Name : {name}</h3>
            <h3>Age : {age}</h3>
            <h3>Address : {address}</h3>
            {fruitList.map((item, index) => { return <h6 key={index}>{item}</h6> })}

        </>
    }
}

export default DataBinding;