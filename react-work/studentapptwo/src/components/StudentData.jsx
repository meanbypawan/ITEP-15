function StudentData({studentList,branchFilter,removeStudent}){
    return <>
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
export default StudentData;