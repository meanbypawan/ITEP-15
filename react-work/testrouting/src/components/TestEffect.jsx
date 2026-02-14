import { useEffect, useState } from "react";

function TestEffect(){
    const [counter,setCounter] = useState(100);
    useEffect(()=>{
        console.log("1st flevor executed..");
    });
    useEffect(()=>{
        console.log("2nd felvour | componentDidMount");
    },[]);
    useEffect(()=>{
        console.log("3rd flevour | componentDidUpdate");
    },[counter]);
    useEffect(()=>{
        return ()=>{
            console.log("component will unmount");
        }
    },[]);
    return <>
      <h1>useEffect()-demo</h1>
      <hr/>
      <button onClick={()=>setCounter(counter+1)}>Change counter : {counter}</button>
    </>
}
export default TestEffect;