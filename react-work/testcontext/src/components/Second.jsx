import { useContext } from "react";
import Third from "./Third";
import { MessageContext } from "../App";

function Second(){
    let {message} = useContext(MessageContext);
    return <>
      <h2>Second Component..{message}</h2>
      <Third/>
    </>
}
export default Second;