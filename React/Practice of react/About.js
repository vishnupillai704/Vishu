import React from "react";
import {useNavigate,useParams} from "react-router-dom";
function About(){
    let navigate=useNavigate();
    let {username}=useParams();
    return( <div><h1> About page</h1> <h1>This is about {username}</h1>  <button onClick={()=>{navigate("/home")}}>Click to go Home page</button></div>)
}

export default About