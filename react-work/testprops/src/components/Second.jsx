function Second({dataList}){
    return <>
      <h2>Second component...</h2>
      <ul>
         {dataList.map((data,index)=>{return <li key={index}>{data.roll} {data.name}</li>})}
      </ul>
    </>
}

export default Second;