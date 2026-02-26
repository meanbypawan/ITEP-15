import { createSlice } from "@reduxjs/toolkit";

const slice = createSlice({
    name: "User-Slice",
    initialState:{
        isLoggedIn: false,
        user: {},
        token: null
    },
    reducers:{
        // action = {type:"setUser", payload:}
        setUser:(state,action)=>{
            console.log(action.payload);
            state.isLoggedIn = true;
            state.user = action.payload.user;
            state.token = action.payload.token;
        },
        signOut: (state,action)=>{
            state.isLoggedIn = false;
            state.user = {};
            state.token = null;
        }
    }
});

export const {setUser, signOut} = slice.actions;
export default slice.reducer;