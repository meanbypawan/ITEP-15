function DataCounter({counter,setCounter}){
    //console.log(props);
    return <>
      <h1>Data Counter</h1>
      <button className="btn btn-danger" onClick={()=>setCounter(counter+1)}>{counter}</button>
    </>
}
export default DataCounter;