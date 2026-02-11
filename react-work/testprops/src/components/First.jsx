/*
  let obj = {name:"abc",age:23, contact:900911232};
  object destructring
  let {name,age} = obj;
  */
function First({m1,m2}){ // props: {m1,m2}
    return <>
       <h2>First Component....{m1} {m2}</h2>
       
    </>
}

export default First;
