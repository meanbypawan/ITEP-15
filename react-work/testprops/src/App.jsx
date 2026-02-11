import First from "./components/First";
import Second from "./components/Second";

function App(){
  let m1 = "Hello....";
  let m2 = "Hii...";
  let dataList = [
    {
      "roll": 1001,
      "name": "A"
    },{
      "roll":1002,
      "name": "B"
    },{
      "roll": 1003,
      "name": "C"
    }
  ];
  return <>
    <h1>App Component...</h1>
    <First m1={m1} m2 = {m2}/>
    <Second dataList={dataList}/>
  </>
}

export default App;