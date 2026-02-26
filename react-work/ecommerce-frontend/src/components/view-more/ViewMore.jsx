import { useNavigate, useParams } from "react-router-dom";
import Header from "../header/Header";
import { useEffect, useState } from "react";
import axios from "axios";
import Api from "../../Api";
import { useRef } from "react";

function ViewMore() {
   const [product, setProduct] = useState({});
   let params = useParams();
   let { id } = params;
   const mainImgRef = useRef(null);
   const navigate = useNavigate();
   useEffect(() => {
      loadProductById();
   }, []);
   const loadProductById = async () => {
      try {
         let response = await axios.get(Api.LOAD_PRODUCT_BY_ID + id);
         setProduct(response.data);
      }
      catch (err) {
         console.log(err);
      }
   }
   const swapImage = (currentImageUrl)=>{
      mainImgRef.current.src = currentImageUrl;
   }
   return <>
      <Header />
      <div className="container mt-3">
         <button onClick={()=>navigate(-1)} className="btn btn-outline-secondary">Back</button>
         <div className="row">
            <div className="col-md-6" style={{ height: "500px", boxShadow: "10px 10px 10px grey" }}>
               <img ref={mainImgRef} src={product.thumbnail} style={{ width: "100%", height: "400px" }} />
               <div className="d-flex justify-content-around align-items-center">
                  {product?.images?.map((imageUrl, index) => { return <img onClick={() => { swapImage(imageUrl) }} key={index} src={imageUrl} width="100px" height="70px" /> })}
               </div>
            </div>
            <div className="col-md-6" style={{ height: "500px", boxShadow: "10px 10px 10px grey" }}>
               <div className="d-flex flex-column p-4">
                  <h5>{product?.title}<span className="text-primary">[{product?.brand}]</span></h5>
                  <hr/>
                  <p>{product?.description}</p>
                  <p><b>Warranty Information : </b>{product?.warrantyInformation}</p>
                  <p><b>Shipping Information : </b>{product?.shippingInformation}</p>
                  <p><b>Availability Status : </b>{product?.availabilityStatus}</p>
                  <p><b>Return Policy : </b>{product?.returnPolicy}</p>
                  <p><b>Rating : </b>{product?.rating}/(5)</p>
                  <div className="d-flex flex-row">
                     <button className="btn btn-outline-secondary" style={{width:"48%"}}>Add To Cart</button>
                     <button onClick={()=>navigate("/buy-now")} className="btn btn-warning ms-2" style={{width:"48%"}}>Buy now</button>
                  </div>
               </div>
            </div>

         </div>
      </div>
   </>
}
export default ViewMore;