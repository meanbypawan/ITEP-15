import { Component } from "react";
import Data from "./Data";
class App extends Component{
  constructor(){
    super();
    this.state = {
      studentList: Data,
      roll: null,
      name: "",
      gender: "",
      branch:"",
      branchFilter: "All"
    }
  }
  addStudent = ()=>{
    
    let newStudent = {roll:this.state.roll, name:this.state.name, gender: this.state.gender,branch:this.state.branch};
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
            <input id="roll" onChange={(event)=>{this.setState({roll: event.target.value})}} type="text" placeholder="Enter roll number" className="form-control"/>
          </div>
          <div className="col-md-6">
            <input onChange={(event)=>{this.setState({name:event.target.value})}} id="name" type="text" placeholder="Enter student name" className="form-control"/>
          </div>
        </div>
        <div className="row mt-2">
          <div className="col-md-6">
            <select onChange={(event)=>{this.setState({gender:event.target.value})}} id="gender" className="form-control">
              <option>select gender</option>
              <option value="Male">Male</option>
              <option value="Female">Female</option>
            </select>
          </div>
          <div className="col-md-6">
            <select onChange={(event)=>{this.setState({branch:event.target.value})}} id="branch" className="form-control">
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
          <div className="col-md-6">
            <button onClick={()=>this.setState({branchFilter:"CS"})} className="btn btn-primary">CS ({this.state.studentList.filter((student)=>{return student.branch=="CS"}).length})</button>
            <button onClick={()=>this.setState({branchFilter:"IT"})} className="btn btn-warning ml-2">IT ({this.state.studentList.filter((student)=>{return student.branch=="IT"}).length})</button>
            <button onClick={()=>this.setState({branchFilter:"CV"})} className="btn btn-danger ml-2">CV ({this.state.studentList.filter((student)=>{return student.branch=="CV"}).length})</button>
            <button onClick={()=>this.setState({branchFilter:"MECH"})} className="btn btn-info ml-2">MECH ({this.state.studentList.filter((student)=>{return student.branch=="MECH"}).length})</button>
            <button onClick={()=>this.setState({branchFilter:"All"})} className="btn btn-secondary ml-2">Total ({this.state.studentList.length})</button>
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
            {this.state.studentList.filter((student)=>{return this.state.branchFilter == "All" || student.branch == this.state.branchFilter}).map((student,index)=>{return <tr key={student.roll}>
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