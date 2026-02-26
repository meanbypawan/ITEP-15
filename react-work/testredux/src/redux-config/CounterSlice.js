import { createSlice } from "@reduxjs/toolkit";

const slice = createSlice({
    name: "Counter-Slice",
    initialState:{
        counter: 100
    },
    reducers:{
        incrementCounter: (state,action)=>{
            state.counter = state.counter + 1
        },
        decrementCounter: (state,action)=>{
            state.counter = state.counter - 1;
        }
    }
});
// slice.actions = {incrementCounter:()=>{},decrementCounter}
export const {incrementCounter,decrementCounter} = slice.actions;
export default slice.reducer;