import React from "react";

function FunctionalComponent(props){
      return (<div>
          {/* <button onClick={props.greethandler}>Greetparent</button> */}
          <button onClick={()=>props.greethandler('child')}>greetparent</button>
      </div>)
}
export default FunctionalComponent