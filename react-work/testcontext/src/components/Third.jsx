import { useContext } from "react";
import { CounterContext, MessageContext } from "../App";

function Third(){
    let {message} = useContext(MessageContext);
    let {counter,setCounter} = useContext(CounterContext);
    return <>
       <h2>Third Component...{message} <button onClick={()=>setCounter(counter+1)}>Increment</button></h2>
       
    </>
}

export default Third;