import { useRef } from "react";

function AddStudent({addStudent,setBranchFilter,branchList,studentList}){
    let rollInput = useRef();//rollInput = {current:}
    let nameInput = useRef();
    let genderInput = useRef();
    let branchInput = useRef();
    const saveStudent = ()=>{
        let roll = rollInput.value;
        let name = nameInput.value;
        let gender = genderInput.value;
        let branch = branchInput.value;
        addStudent(roll,name,gender,branch);
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
          <button onClick={saveStudent} className="btn btn-success">ADD</button>
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
    </>
}
export default AddStudent;