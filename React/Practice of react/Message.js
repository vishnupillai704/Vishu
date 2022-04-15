import React,{ Component } from "react";

class Message extends Component{
    constructor(){
        super()
        this.state={
            message:"hi visitor"
        }
        // this.changeMessage=this.changeMessage.bind(this)
    }
    changeMessage(){
        this.setState({
            message:'thankyou for subscribing'
        })
    }
    render(){
        return (<div><h1>{this.state.message}</h1>
     <button onClick={()=>this.changeMessage()}>Subscribe</button>    
     {/* <button onClick={this.changeMessage}>Subscribe</button>   second way to call eventhandler  */}
    </div>
        );
    }
}
export default Message