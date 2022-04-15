import React,{Component} from "react";

class Usergreeting extends Component{
    constructor(){
        super()
        this.state=({
            isLoggedin:false
        })
    }
    render(){
        // if(this.state.isLoggedin){
        //     return (<div>HI Vishnu</div>)
        // }
        // else{
        //     return(<div>HI Guest </div>)
        // }

        // let Message
        // if(this.state.isLoggedin){
        //     Message=<div>hello Vishnu</div>
        // }
        // else{
        //     Message=<div>Hi Guest</div>
        // }
        // return <div>{Message}</div>

        return this.state.isLoggedin ? (<div>Hello vishnu</div>) : (<div>Welcome guest</div>)

    }
}
export default Usergreeting 