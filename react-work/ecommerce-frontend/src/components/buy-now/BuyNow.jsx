import { useLocation } from "react-router-dom";
import Header from "../header/Header";
import { useRef } from "react";
import { useSelector } from "react-redux";

function BuyNow(){
    const location = useLocation();
    let {title,id,price,brand} = location.state.params;
    const {user,token} = useSelector((store)=>store.user);
    let nameRef = useRef();
    let contactRef = useRef();
    let addressRef = useRef();
    const handleSubmit = (event)=>{
      event.preventDefault();
      let name = nameRef.current.value;
      let contact = contactRef.current.value;
      let address = addressRef.current.value;
      console.log(name+"  "+contact+"  "+address);
    }
    return <>
       <Header/>
       <div className="container mt-3">
        <div>
            <h3>Product details</h3>
            <hr/>
            <p><b>Title : </b>{title} [{brand}]</p>
            <p><b>Price : </b>{price} Rs.</p>
        </div>
        <form className="mt-3" onSubmit={handleSubmit}>
          <div className="form-group mt-2">
                <input defaultValue={user.email} ref={nameRef} type="text" placeholder="Enter name" className="form-control"/>
          </div>
          <div className="form-group mt-2">
               <input defaultValue={user.contact} ref={contactRef} type="text" placeholder="Enter contact number" className="form-control"/>
          </div>
          <div className="form-group mt-2">
            <textarea ref={addressRef} placeholder="Enter deliver address" className="form-control"></textarea>
          </div>
          <div className="form-group mt-2">
            <button className="btn btn-warning" type="submit">Place order</button>
          </div>
        </form>
       </div>
    </>
}

export default BuyNow;