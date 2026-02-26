import { useSelector } from "react-redux";
import { Navigate } from "react-router-dom";
function Auth({children}){ // children = <BuyNow/>
  const {isLoggedIn} = useSelector((store)=>store.user);
  if(isLoggedIn)
    return children;
  else
   return <Navigate to="/"/>
}
export default Auth;