import React,{useState} from "react";

function Hookcounter(){
    const[count,setCount]=useState(0)
    return(
        <div>
            <button onMouseOver={()=>setCount(count+1)}>Click {count}</button>
        </div>
    )

}
export default Hookcounter

