
import React from 'react';

const Greet= (props) =>{
    return(<div><h1>{props.name} age={props.age} hair={props.hair}</h1>
    {props.children}
    </div>
    )
}
export default Greet
