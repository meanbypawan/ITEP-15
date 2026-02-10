import { useRef, useState } from "react";
import Data from "./Data";
function App(){
  const [studentList,setStudentList] = useState(Data); 
  const [branchList,setBranchList] = useState(["CS","IT","CV","MECH"]);
  const [branchFilter,setBranchFilter] = useState("All");
  let rollInput = useRef();//rollInput = {current:}
  let nameInput = useRef();
  let genderInput = useRef();
  let branchInput = useRef();
  const addStudent = ()=>{
    let roll = rollInput.current.value;
    let name = nameInput.current.value;
    let gender = genderInput.current.value;
    let branch = branchInput.current.value;
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
  return <>
    <div className="container mt-3">
      <div className="row">
        <div className="col-md-6">
          <input ref={rollInput} type="text" placeholder="Enter roll number" className="form-control"/>
        </div>
        <div className="col-md-6">
          <input ref={nameInput} type="text" placeholder="Enter student name" className="form-control"/>
        </div>
      </div>
      <div className="row mt-3">
        <div className="col-md-6">
          <select ref={genderInput} className="form-control">
            <option value="male">Male</option>
            <option value="female">Female</option>
          </select>
        </div>
        <div className="col-md-6">
          <select ref={branchInput} className="form-control">
           {branchList.map((branch,index)=>{return <option key={branch} value={branch}>{branch}</option>})}
          </select>
        </div>
      </div>
      <div className="row mt-3 mb-3">
        <div className="col-md-6">
          <button onClick={addStudent} className="btn btn-success">ADD</button>
        </div>
        <div className="col-md-6">
          <button onClick={()=>setBranchFilter("CS")} className="btn btn-danger">CS({studentList.filter((student)=>{return student.branch == "CS"}).length})</button>
          <button onClick={()=>setBranchFilter("IT")} className="btn btn-primary ms-2">IT({studentList.filter((student)=>{return student.branch == "IT"}).length})</button>
          <button onClick={()=>setBranchFilter("CV")} className="btn btn-warning ms-2">CV({studentList.filter((student)=>{return student.branch == "CV"}).length})</button>
          <button onClick={()=>setBranchFilter("MECH")} className="btn btn-info ms-2">MECH({studentList.filter((student)=>{return student.branch == "MECH"}).length})</button>
          <button onClick={()=>setBranchFilter("All")} className="btn btn-secondary ms-2">Total({studentList.length})</button>
        
        </div>
      </div>
    </div>
    <table className="table table-striped container">
      <thead>
        <tr>
          <th>S.no</th>
          <th>Roll number</th>
          <th>Name</th>
          <th>Gender</th> 
          <th>Branch</th>
        </tr>
      </thead>
      <tbody>
        {studentList.filter((student)=>{return branchFilter == "All" || branchFilter == student.branch}).map((student,index)=>{return <tr key={student.roll}>
          <td>{index*+1}</td>
          <td>{student.roll}</td>
          <td>{student.name}</td>
          <td>{student.gender}</td>
          <td>{student.branch}</td>
          <td><button onClick={()=>{removeStudent(student.roll)}} className="btn btn-outline-danger">Remove</button></td>
        </tr>})}
      </tbody>
    </table>
  </>
}
export default App;