import React from "react";

function FunctionalClick(){
    function clickhandler(){
        console.log("clicked");
    }
    return(<div>
        <button onClick={clickhandler}> click</button>
    </div>

    )
      

}
export default FunctionalClick