import React,{useEffect, useState} from "react";
import './Q5.css'
function Q5(){
    const[clock,setclock]=useState() 
    const[dates,setdate]=useState()

 useEffect(()=>{
     setInterval(()=>{
         const date =new Date();
         setclock(date.toLocaleTimeString())
     },1000);
 },[]);

 const datehandle=()=>{
     const date=new Date();
     setdate(date.toLocaleDateString())
}


 return(<div className="containe" >
     <div className="Digital">
         <h1>Digital Clock</h1>
     </div>
     <div className="date"><button onClick={datehandle} className="head">Date</button></div>
     <div className="clock">
       <h1 className="main">{clock}</h1>  
       <h2 className="dates">{dates}</h2>
    </div>
     </div>)

}
export default Q5