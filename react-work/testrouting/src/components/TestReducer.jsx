import { useReducer } from "react";

function TestReducer(){
    // state : {counter: 100}
    const [state,dispatch] = useReducer((state,action)=>{
        if(action.type=="increment"){
          state.counter = state.counter + 1;
        }
        else if(action.type == "decrement"){
          state.counter = state.counter - 1;
        }
        else if(action.type == "custom"){
            state.counter = state.counter + action.payload;
        }
        return {...state};
    },{
        counter: 100
    });
    return <>
       <h1>useReducer() demo</h1>
       <hr/>
       <button onClick={()=>dispatch({type:"increment"})}>Increment counter: {state.counter}</button>
       <button onClick={()=>dispatch({type:"decrement"})}>Decrement Counter: {state.counter}</button>
       <button onClick={()=>dispatch({type:"custom",payload:5})}>Increment counter By {state.counter}</button>
    </>
}

export default TestReducer;