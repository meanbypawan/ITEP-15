import axios from "axios";
import { useEffect, useReducer } from "react";

function App(){
  const [state,dispatch] = useReducer((state,action)=>{
    if(action.type=="set-product"){
        state.productList = action.payload;
    }
    return {...state};
  },{
    productList: []
  });
  useEffect(()=>{
    loadProducts();
  },[]);

  const loadProducts = ()=>{
    axios.get("https://dummyjson.com/products")
    .then(response=>{
      let products = response.data.products;
      dispatch({type:"set-product",payload:products});
    }).catch(err=>{
      console.log(err);
    });
  }
  return <>
    <h3 className="bg-danger p-2 text-white text-center">Axios App</h3>
    <div className="container mt-3">
      <table className="table table-striped">
        <thead>
          <tr>
            <td>Id</td>
            <td>Title</td>
            <td>Image</td>
            <td>Price</td>
            <td>Brand</td>
          </tr>
        </thead>
        <tbody>
          {state.productList.map((product,index)=>{return <tr key={product.id}>
            <td>{product.id}</td>
            <td>{product.title}</td>
            <td><img src={product.thumbnail} width="100px" height="100px"/></td>
            <td>{product.price}</td>
            <td>{product.brand}</td>
          </tr>})}
        </tbody>
      </table>
    </div>
  </>
}

export default App;