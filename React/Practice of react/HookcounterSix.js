import React,{useState,useEffect} from "react";

function HookcounterSix(){
    const[count,setcount]=useState(0)

     const tick=()=>{
         setcount(count=>count+1)
     }
      
     useEffect(()=>{
         const interval=setInterval(tick, 2000);
         return ()=>{
             clearInterval(interval)
         }
     },[count])

     return(
         <div>
             {count}
         </div>
     )
}
export default HookcounterSix