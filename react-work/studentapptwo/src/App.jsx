import { useRef, useState } from "react";
import Data from "./Data";
import Header from "./components/Header";
import StudentData from "./components/StudentData";
import AddStudent from "./components/AddStudent";
import DataCounter from "./components/DataCounter";
function App(){
  const [studentList,setStudentList] = useState(Data); 
  const [branchList,setBranchList] = useState(["CS","IT","CV","MECH"]);
  const [branchFilter,setBranchFilter] = useState("All");
  const addStudent = (roll,name,gender,branch)=>{
    let newStudent = {roll,name,gender,branch};
    setStudentList([...studentList,newStudent]);
  }
  const removeStudent = (roll)=>{
    if(window.confirm("Do you want to delete it?")){
     let index =  studentList.findIndex((student)=>{return student.roll == roll});
     studentList.splice(index,1);
     setStudentList([...studentList]);
    }
  }
  const [counter,setCounter] = useState(100);
  return <>
    <DataCounter counter={counter} setCounter={setCounter}/>
    <Header/>

    <AddStudent addStudent={addStudent} setBranchFilter={setBranchFilter} branchList={branchList} studentList={studentList}/>
    
    <StudentData studentList={studentList} branchFilter={branchFilter} removeStudent={removeStudent}/>
  </>
}
export default App;