import { Component } from "react";
import Data from "./Data";
class App extends Component{
  constructor(){
    super();
    this.state = {
      studentList: Data
    }
  }
  addStudent = ()=>{
    let roll = document.getElementById("roll").value;
    let name = document.getElementById("name").value;
    let gender = document.getElementById("gender").value;
    let branch = document.getElementById("branch").value;
    let newStudent = {roll, name, gender,branch};
    this.setState({studentList: [...this.state.studentList,newStudent]})
  }
  removeStudent = (roll)=>{
    if(window.confirm("Do you want to delete it ?")){
     let index =  this.state.studentList.findIndex((student)=>{return student.roll == roll});
     this.state.studentList.splice(index,1);
     this.setState({studentList:[...this.state.studentList]});
    }
  }
  render(){
    console.log(this.state.studentList);
    return <>
      <div className="container-fluid bg-danger p-2">
        <h2 className="text-white text-center">Student app</h2>
      </div>
      <div className="container mt-3">
        <div className="row">
          <div className="col-md-6">
            <input id="roll" type="text" placeholder="Enter roll number" className="form-control"/>
          </div>
          <div className="col-md-6">
            <input id="name" type="text" placeholder="Enter student name" className="form-control"/>
          </div>
        </div>
        <div className="row mt-2">
          <div className="col-md-6">
            <select id="gender" className="form-control">
              <option>select gender</option>
              <option value="Male">Male</option>
              <option value="Female">Female</option>
            </select>
          </div>
          <div className="col-md-6">
            <select id="branch" className="form-control">
              <option value="0">select branch</option>
              <option value="CS">CS</option>
              <option value="IT">IT</option>
              <option value="CV">CV</option>
              <option value="MECH">MECH</option>
            </select>
          </div>
        </div>
        <div className="row mt-3">
          <div className="col-md-6">
            <button onClick={this.addStudent} className="btn btn-success">ADD</button>
          </div>
        </div>
      </div>
      <div className="container mt-3">
        <table className="table">
          <thead>
            <tr>
              <th>Roll number</th>
              <th>Name</th>
              <th>Gender</th>
              <th>Branch</th>
              <th>Remove</th>
            </tr>
          </thead>
          <tbody>
            {this.state.studentList.map((student,index)=>{return <tr key={student.roll}>
              <td>{student.roll}</td>
              <td>{student.name}</td>
              <td style={{textTransform: "capitalize"}}>{student.gender}</td>
              <td>{student.branch}</td>
              <td><button onClick={()=>{this.removeStudent(student.roll)}} className="btn btn-outline-danger">Remove</button></td>
            </tr>})}
          </tbody>
        </table>
      </div>
    </>
  }
}

export default App;