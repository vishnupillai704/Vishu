import React,{useState} from "react";                                                                   //vishnu

function Q3(){
    const[name,setname]=useState('')
    const[job,setjob]=useState('')
    const[name1,setname1]=useState('')
    const[job1,setjob1]=useState('')
    const[name2,setname2]=useState('')
    const[job2,setjob2]=useState('')
    

    //this will show alert and change title of page
    const handler=()=>{
        return(<div>
            {document.title=`Added successfully`}
            {alert(`Name- ${name} job-${job} added succesfully`)}
        </div>
        )
    }
      
    const handle=()=>{
        return(<div>
            {document.title=`Added successfully`}
            {alert(`Name- ${name1} job-${job1} added succesfully`)}
        </div>
        )
    }
    
    const handl=()=>{
        return(<div>
            {document.title=`Added successfully`}
            {alert(`Name- ${name2} job-${job2} added succesfully`)}
        </div>
        )
    }

    //this will delete the data

    const remove=()=>{
        return (setname("") & setjob("") )}
    
    const remove1=()=>{
       return (setname1("") & setjob1("") )}

    const remove2=()=>{
        return (setname2("") & setjob2("") )}
 
    
    // this will display the data
    return(<div>
        <h1>Details of Employee</h1>
       <table>
           <th>Name</th>
           <th>job</th>
           <th>Remove</th>
           <tr>
              <td>{name}</td>
              <td>{job}</td> 
              <td><button onClick={remove}>Delete</button></td>
           </tr>
           <tr>
               <td>{name1}</td>
               <td>{job1}</td>
               <td><button onClick={remove1}>Delete</button></td>

           </tr>
           <tr>
               <td>{name2}</td>
               <td>{job2}</td>
               <td><button onClick={remove2}>Delete</button></td>

           </tr>
       </table>
       <br></br>

        <h1>Add New Employee</h1>
        <table>
            <th>Name</th>
            <th>Job</th>
            <tr>
             <td>1) <input type="text" value={name} onChange={e=>setname(e.target.value)} /> </td> 
             <td><input type="text" value={job} onChange={e=>setjob(e.target.value)} /> </td>
             <td><button type="submit" onClick={handler}>Submit</button></td>  
            </tr>
            <tr>
             <td>2) <input type="text" value={name1} onChange={e=>setname1(e.target.value)} /> </td> 
             <td><input type="text" value={job1} onChange={e=>setjob1(e.target.value)} /></td>
             <td><button type="submit" onClick={handle}>Submit</button></td> 
            </tr>
             
            <tr>
             <td>3) <input type="text" value={name2} onChange={e=>setname2(e.target.value)} /> </td> 
             <td><input type="text" value={job2} onChange={e=>setjob2(e.target.value)} /></td>
             <td><button type="submit" onClick={handl}>Submit</button></td> 
            </tr>
        </table>
    </div>

    )

}
export default Q3