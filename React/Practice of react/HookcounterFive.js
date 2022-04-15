import React,{useState,useEffect} from "react";

function HookcounterFive(){
    const[count,setcount]=useState(0)
    const[name,setname]=useState('')

    useEffect(()=>{
        console.log("document title");
        document.title=`Clicked ${count} times`
    },[count]) //second parameter in useEffect means useEffect will only render when count value change not everytime

    return(
        <div>
            <input type="text" value={name} onChange={e=>setname(e.target.value)} ></input>
            <button onClick={()=>setcount(count+1)}>Clicked {count} times</button>
        </div>
    )
}
export default HookcounterFive