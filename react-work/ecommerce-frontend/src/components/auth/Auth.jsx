export const isLoggedIn = ()=>{
    return !!sessionStorage.getItem("isLoggedIn"); // false
}
function Auth(){

}
export default Auth;