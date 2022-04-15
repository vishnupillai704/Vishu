import React,{Component} from "react";

class ClassClick extends Component{
    clickhandler(){
        console.log("you clicked me");
    }
       render(){
           return(<div>
               <button onClick={this.clickhandler} >click me</button>

           </div>

           )
       }
}
export default ClassClick