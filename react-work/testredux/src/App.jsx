import { useDispatch, useSelector } from "react-redux";
import { decrementCounter, incrementCounter } from "./redux-config/CounterSlice";

function App(){
  let {counter} = useSelector((store)=>store.DataCounter);
  const dispatch = useDispatch();
  return <>
     <h1>Redux Demo...{counter}</h1>
     <button onClick={()=>dispatch(incrementCounter())}>Increment</button>
     <button onClick={()=>dispatch(decrementCounter())}>Decrement</button>
  </>
}
export default App;