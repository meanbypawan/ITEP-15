import { Route, Routes } from "react-router-dom";
import Home from "./components/home/Home";
import { createContext, useEffect, useState } from "react";
import Api from "./Api";
import axios from "axios";
import ViewMore from "./components/view-more/ViewMore";
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
     </Routes>
    </CategoryContext.Provider>
  </>
}
export default App;