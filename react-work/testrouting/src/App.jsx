import { Link, Route, Routes } from "react-router-dom";
import Home from "./components/Home";
import About from "./components/About";
import Contact from "./components/Contact";
import TestReducer from "./components/TestReducer";
import TestEffect from "./components/TestEffect";

function App(){
  return <>
    <header className="bg-danger text-white d-flex align-items-center p-2 justify-content-around">
      <Link to="/"><label>Home</label></Link>
      <Link to="/about"><label>About us</label></Link>
      <Link to="/contact"><label>Contact us</label></Link>
      <Link to="/reducer"><label>Use reducer</label></Link>
      <Link to="/effect"><label>Use Effect</label></Link>
    </header>
    <Routes>
      <Route path="/" element={<Home/>}/>
      <Route path="/about" element={<About/>}/>
      <Route path="/contact" element={<Contact/>}/>
      <Route path="/reducer" element={<TestReducer/>}/>
      <Route path="/effect" element={<TestEffect/>}/>
    
    </Routes>
  </>
}
export default App;