import React,{Component} from "react";
import LifecycleB from "./LifecycleB";

class LifecycleA extends Component{
    constructor(props){
        super(props)
        this.state={
            name:"vishnu"
        }
        console.log('LifeCycleConstructor A');
    }
    static getDerivedStateFromProps(){
        console.log('LifecycleA getDerivedStateFromProps');
    }
    componentDidMount(){
        console.log('LifecycleA componentDidMount');
        return null
    }
    render(){
        console.log('LifecycleA render');
        return (<div><div>LifecycleA</div>
        <LifecycleB/></div>
        )}
}
export default LifecycleA