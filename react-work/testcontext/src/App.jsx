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
    <CounterContext.Provider value={{counter,setCounter}}>
     <MessageContext.Provider value={{message}}>
       <First/>
     </MessageContext.Provider>
    </CounterContext.Provider>
  </>
}
export default App;