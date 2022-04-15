import React,{useState} from "react";

function HookcounterFour(){

    const[items,setitems]=useState([])
 
     const itemadd=()=>{setitems([...items,{
         id:items.length,
         value: Math.floor(Math.random()*10)+1
     }

     ])}

    return(
        <div>
            <button onClick={itemadd} >Add number</button>
            <ul>
                {
                  items.map(item=><li key={item.id}> value={item.value}</li>)     
                }
            </ul>
        </div>
    )
}
export default HookcounterFour