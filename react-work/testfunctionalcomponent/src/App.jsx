import { useState } from "react";

function App(){
  const [counter,setCounter] = useState(100);
  const incrementCounter = ()=>{
    setCounter(counter+1);
  }
  return <>
    <h1>App component...</h1>
    <button onClick={incrementCounter}>Counter : {counter}</button>
  </>
}

export default App;