import React,{Component} from "react";

class LifecycleB extends Component{
    constructor(props){
        super(props)
        this.state={
            name:"vishnu"
        }
        console.log('LifeCycleConstructor B');
    }
    static getDerivedStateFromProps(){
        console.log('LifecycleB getDerivedStateFromProps');
    }
    componentDidMount(){
        console.log('LifecycleB componentDidMount');
        return null
    }
    render(){
        console.log('LifecycleB render');
        return <div>LifecycleB</div>
    }
}
export default LifecycleB