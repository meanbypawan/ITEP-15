import { configureStore } from "@reduxjs/toolkit";
import CounterSlice from "./CounterSlice";
const store = configureStore({
    reducer:{
        DataCounter: CounterSlice
    }
});
// DataCounter = {counter:100}
export default store;