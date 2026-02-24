import { Route, Routes } from "react-router-dom";
import Home from "./components/home/Home";
import { createContext, useEffect, useState } from "react";
import Api from "./Api";
import axios from "axios";
import ViewMore from "./components/view-more/ViewMore";
import SignUp from "./components/signup/SignUp";
import SignIn from "./components/signin/Signin";
import 'react-toastify/dist/ReactToastify.css';
export const CategoryContext = createContext();
function App(){   
  const [categoryList,setCategoryList] = useState([]);
    useEffect(()=>{
        loadCategories();
    },[]);
    const loadCategories = async ()=>{
       try{ 
        let response = await axios.get(Api.LOAD_CATEGORIES);
        setCategoryList(response.data);
       }
       catch(err){
        console.log(err);
       } 
    }
  return <>
   <CategoryContext.Provider value={{categoryList,setCategoryList}}>
     <Routes>
       <Route path="/" element={<Home/>}/>
       <Route path="/view-more/:id" element={<ViewMore/>}/>
       <Route path="/sign-up" element={<SignUp/>}/>
       <Route path="/sign-in" element={<SignIn/>}/>
     </Routes>
    </CategoryContext.Provider>
  </>
}
export default App;