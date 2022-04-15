import React,{ Component } from "react";

class Welcome extends Component{
    render(){
        return <h1>hi {this.props.name} age={this.props.age}</h1>
    }
}
export default Welcome