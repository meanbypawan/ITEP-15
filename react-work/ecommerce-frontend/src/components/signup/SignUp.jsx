import axios from "axios";
import { useState } from "react";
import Api from "../../Api";
import { useNavigate } from "react-router-dom";

function SignUp(){
    const [email,setEmail] = useState("");
    const [password,setPassword] = useState("");
    const[contact,setContact] = useState("");
    const navigate = useNavigate();
    const handleSubmit = async (event)=>{
       try{ 
        event.preventDefault();
        let response = await axios.post(Api.SIGN_UP,{email,password,contact});
        navigate("/sign-in");
       }
       catch(err){
         console.log(err);
       } 
    }
    return <>
      <div className="container d-flex justify-content-center align-items-center" style={{height:"650px"}}>
        <div className="form-container border" style={{width:"40%",minHeight:"200px",boxShadow:"10px 10px 10px grey"}}>
          <h3 className="bg-warning text-white text-center p-2">Sign up</h3>
          <form onSubmit={handleSubmit} className="p-2">
            <input onChange={(event)=>{setEmail(event.target.value)}} type="text" placeholder="Enter email id" className="form-control"/>
            <input onChange={(event)=>{setPassword(event.target.value)}} type="password" placeholder="Enter password" className="form-control mt-2"/>
            <input onChange={(event)=>{setContact(event.target.value)}} type="text" placeholder="Enter contact number" className="form-control mt-2"/>
            <button type="submit" className="btn btn-secondary mt-2" style={{width:"100%"}}>Submit</button>
          </form>
        </div>
      </div>
    </>
}
export default SignUp;