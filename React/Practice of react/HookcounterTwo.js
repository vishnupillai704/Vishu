import React,{useState} from "react";

function HookcounterTwo(){
    const initialcount=0
    const [count,setCount]=useState(initialcount)
    return(
        <div>
            Count:{count}
            <button onMouseOver={()=>setCount(initialcount)}>Reset</button>
            <button onMouseOver={()=>setCount(count => count + 1)} >Increment</button>
            <button onMouseOver={()=>setCount(count=> count - 1)}>Decrement</button>
        </div>
    )
}
export default HookcounterTwo