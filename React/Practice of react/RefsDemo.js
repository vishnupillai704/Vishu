import React,{Component} from "react";
class RefsDemo extends Component{
    constructor(){
        super()
        this.inputref=React.createRef()
    }
    componentDidMount(){
        this.inputref.current.focus()
    }
    clickHandler=()=>{
        alert(this.inputref.current.value)
    }
    render(){
        return (<div>
            <input type="text" ref={this.inputref}></input>
            <button onClick={this.clickHandler}>Click Me</button>
        </div>)
    }
}
export default RefsDemo