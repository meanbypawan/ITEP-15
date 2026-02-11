import { createContext, useState } from "react";
import First from "./components/First";

export const MessageContext = createContext();
export const CounterContext = createContext();
function App(){
  const [counter,setCounter] = useState(100);
  let message = "Hello....";
  return <>
    <h1>App Component...</h1>
    <h1>Counter: {counter}</h1>
    <CounterContext value={{counter,setCounter}}>
     <MessageContext value={{message}}>
       <First/>
     </MessageContext>
    </CounterContext>
  </>
}
export default App;