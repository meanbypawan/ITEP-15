import { useContext, useEffect, useState } from "react";
import Header from "../header/Header";
import "./Home.css";
import axios from "axios";
import Api from "../../Api";
import { CategoryContext } from "../../App";
import { useNavigate } from "react-router-dom";
function Home(){
    const [productList,setProductList] = useState([]);
    const [filterProduct,setFilterProduct] = useState([]);
    const {categoryList,setCategoryList} = useContext(CategoryContext);
    const navigate = useNavigate();
    useEffect(()=>{
        loadProducts();
    },[]);
    
    const loadProducts = ()=>{
       axios.get(Api.LOAD_PRODUCTS)
       .then(response=>{
         setProductList(response.data);
         setFilterProduct(response.data);
        }).catch(err=>{
         console.log(err);
        });
    }
    const loadProductByCategory = (category)=>{
       let filteredProduct =  productList.filter((product)=>{return product.category == category});
       setFilterProduct([...filteredProduct]);
    }
    return <>
      <Header/>
      <div className="container mt-3">
        <div className="d-flex flex-row" style={{flexWrap:"wrap"}}>
          {categoryList.map((category,index)=>{return <h5 onClick={()=>loadProductByCategory(category.categoryName)} className="p-1 rounded d-flex justify-content-center align-items-center" key={category.id} style={{width:"10%", backgroundColor:"grey", color:"white", columnGap:"10px",marginLeft:"10px", fontSize:"12px",textTransform:"capitalize"}}>{category.categoryName}</h5>})}
        </div>
        <hr/>
        <div className="row">
            {filterProduct.map((product,index)=>{return <div key={product.id} className="col-md-3">
                <div className="card-container d-flex flex-column align-items-center">
                  <img src={product.thumbnail} width="100%" height="180px"/>
                  <p>{product.title.substring(0,30)}</p>
                  <p>Price : <b className="text-success" style={{fontSize:"20px"}}>{product.price} Rs.</b></p>
                  <button onClick={()=>navigate(`/view-more/${product.id}`)} style={{width:"100%"}} className="btn btn-warning">View more</button>
                </div>
            </div>})} 
        </div>
      </div>
    </>
}
export default Home;