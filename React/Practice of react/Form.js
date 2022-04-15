import React,{Component} from "react";

class Form extends Component{
    constructor(){
        super()
        this.state={
            username:'',
            comment:'',
            topic:'react'

        }
    }
        handleUsernameChange=(event)=>{
            this.setState({
                username:event.target.value
            })
        }
        handleCommentChange=(event)=>{
            this.setState({
                comment:event.target.value
            })
        }
        handleTopicChange=(event)=>{
            this.setState({
                topic:event.target.value
            })
        }
        handleSubmit=(event)=>{
            alert(`Username:${this.state.username} comment: ${this.state.comment} Topic : ${this.state.topic}`)
            event.preventDefault()        
        }
            render(){
        return(
            <form onSubmit={this.handleSubmit}>
            <div>
                <label>Username</label>
                <input type="text" value={this.state.username} onChange={this.handleUsernameChange} ></input>
            </div>
            <div>
                <label>Comments</label>
                <textarea value={this.state.comment} onChange={this.handleCommentChange}></textarea>
            </div>
            <div>
                <label>Topic</label>
                <select value={this.state.topic} onChange={this.handleTopicChange}>
                    <option value="react">react</option>
                    <option value="Angular">angular</option>
                    <option value="python">python</option>
                </select>
            </div>
            <button type="submit">Submit</button>
            </form>
        )
    }

}
export default Form