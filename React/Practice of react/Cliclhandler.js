import React,{Component} from "react";


class Cliclhandler extends Component{
    constructor(props){
        super(props)
        this.state={
            count:0
        }
    }
    clickHandle=()=>{
        this.setState(prevstate=>{
            return {
                count:prevstate.count +1
            }
        })
    }
    render(){
        const {count} =this.state
        return (<div>
            <button onClick={this.clickHandle}>Clicked {count} times</button>
        </div>)
    }
}
export default Cliclhandler