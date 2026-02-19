import { useParams } from "react-router-dom";
import Header from "../header/Header";
import { useEffect, useState } from "react";
import axios from "axios";
import Api from "../../Api";

function ViewMore(){
    const [product,setProduct] = useState({});
    let params = useParams();
    let {id} = params;
    useEffect(()=>{
        loadProductById();
    },[]);
    const loadProductById = async()=>{
       try{ 
        let response = await axios.get(Api.LOAD_PRODUCT_BY_ID+id);
        setProduct(response.data);
       }
       catch(err){
        console.log(err);
       }
       
    }
    return <>
       <Header/>
       <div className="container mt-3">
         <div className="row">
            <div className="col-md-6" style={{height:"500px", boxShadow:"10px 10px 10px grey"}}>
               <img src={product.thumbnail} style={{width:"100%",height:"400px"}}/> 
               <div className="d-flex justify-content-around align-items-center">
                 {product?.images?.map((imageUrl,index)=>{return <img key={index} src={imageUrl} width="100px" height="70px"/>})}
               </div>
            </div>
            <div className="col-md-6" style={{height:"500px", boxShadow:"10px 10px 10px grey"}}></div>
            
         </div>
       </div>
    </>
}
export default ViewMore;