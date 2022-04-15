import React,{ Component } from "react";
import FunctionalComponent from "./FunctionalComponent";

class ParentComponent extends Component{
    constructor(){
        super()
        this.state={
            message:"parent"
        }
        this.greetparent=this.greetparent.bind(this)

    }
    greetparent(childName){
        alert(`Hello ${this.state.message} from ${childName}`)
        
    }
    render(){
        return (<div>
            <FunctionalComponent greethandler={this.greetparent}></FunctionalComponent>
        </div>)
    }

}
export default ParentComponent