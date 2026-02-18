import { useEffect, useState } from "react";
import Header from "../header/Header";
import "./Home.css";
import axios from "axios";
import Api from "../../Api";
function Home(){
    const [productList,setProductList] = useState([]);
    
    useEffect(()=>{
        loadProducts();
    },[]);
    
    const loadProducts = ()=>{
       axios.get(Api.LOAD_PRODUCTS)
       .then(response=>{
         setProductList(response.data);
        }).catch(err=>{
         console.log(err);
        });
    }
    return <>
      <Header/>
      <div className="container mt-3">
        <div className="row">
            {productList.map((product,index)=>{return <div key={product.id} className="col-md-3">
                <div className="card-container d-flex flex-column align-items-center">
                  <img src={product.thumbnail} width="100%" height="180px"/>
                  <p>{product.title.substring(0,30)}</p>
                  <p>Price : <b className="text-success" style={{fontSize:"20px"}}>{product.price} Rs.</b></p>
                  <button style={{width:"100%"}} className="btn btn-warning">View more</button>
                </div>
            </div>})} 
        </div>
      </div>
    </>
}
export default Home;