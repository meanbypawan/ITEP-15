import { useState } from "react";
import Data from "./ToDoData";
function App(){
  const [taskList,setTaskList] = useState(Data);
  const [priorityList,setPriorityList] = useState([
    {"priorityId":1,"value":"Low"},
    {"priorityId":2, "value":"Medium"},
    {"priorityId":3, "value":"High"}
  ]);
  const [defaultStatus,setDefaultStatus] = useState("active");
  const changeTaskStatus = (task,status)=>{
    let index = taskList.findIndex((taskObj)=>{return taskObj.title == task.title});
    taskList.splice(index,1);
    task.status = status;
    taskList.splice(index,0,task);
    setTaskList([...taskList]);
  }
  return <>
    <header className="bg-danger text-white p-1">
      <h2 className="text-center">ToDo App</h2>
    </header>
    <div className="container mt-3">
    <div className="">
     <button disabled={defaultStatus == "active"? true: false} onClick={()=>setDefaultStatus("active")} className="btn btn-success">Active({taskList.filter((task)=>{return task.status == "active"}).length})</button>
     <button disabled={defaultStatus=="deactive"?true:false} onClick={()=>setDefaultStatus("deactive")} className="btn btn-primary ms-3">Deactive({taskList.filter((task)=>{return task.status == "deactive"}).length})</button>
    </div>   
    <table className="table">
      <thead>
        <tr>
          <th>S.no</th>
          <th>Title</th>
          <th>Date</th>
          <th>Priority</th>
          <th>Change Status</th>
        </tr>
      </thead>
      <tbody>
        {taskList.filter((task)=>{return task.status == defaultStatus}).sort((a,b)=>{return b.pid-a.pid}).map((task,index)=>{return <tr className={task.pid==1?"table-success":task.pid==2?"table-warning":"table-danger"} key={index}>
          <td>{index*1+1}</td>
          <td>{task.title}</td>
          <td>{task.date}</td>
          <td>{priorityList.find((priorityObj)=>{return priorityObj.priorityId == task.pid}).value}</td>
          <td>
           {task.status == "active" ? <button className="btn btn-outline-danger" onClick={()=>{changeTaskStatus(task,"deactive")}}>Deactive</button> : <button onClick={()=>changeTaskStatus(task,"active")} className="btn btn-outline-danger">Active</button>}
          </td>
        </tr>})}
      </tbody>
    </table>
    </div>
  </>
}
export default App;