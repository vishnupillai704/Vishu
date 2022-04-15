import React,{useState} from "react";
function HookcounterThree(){
    const [name,setname] =useState({firstname:"",Secondname:""})
    return(
        <form>
            <input type="text" value={name.firstname} onChange={e=>setname({...name,firstname:e.target.value})}/>
            <input type="text" value={name.Secondname} onChange={e=>setname({...name,Secondname:e.target.value})}/>
        <h1>Your firstname is {name.firstname}</h1>
        <h1>Your Secondname is {name.Secondname}</h1>
        </form>
    )
}
export default HookcounterThree