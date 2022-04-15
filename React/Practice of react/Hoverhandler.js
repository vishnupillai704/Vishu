import React,{Component} from "react";
class Hoverhandler extends Component{
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
        const {count}=this.state
        return (<div>
            <button onMouseOver={this.clickHandle}>hover {count} times</button>
        </div>)
    }

}
export default Hoverhandler