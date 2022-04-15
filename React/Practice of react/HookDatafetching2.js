import React,{useState,useEffect} from "react";
import axios from 'axios';

function HookDatafetching2(){
    const[post,setpost]=useState({})
    const[id,setid]=useState(1)
    const[idfrombuttonclick,setidfrombuttonclick]=useState(1)
    const handleclick=()=>{
        setidfrombuttonclick(id)
    }

    useEffect(() => {
		axios
			.get(`https://jsonplaceholder.typicode.com/posts/${idfrombuttonclick}`)
			.then(res => {
        console.log(res)
        setpost(res.data)
			})
			.catch(err => {
				console.log(err)
			})
	}, [idfrombuttonclick])

    return(
        <div>
            
           <input type="text" value={id} onChange={e=>setid(e.target.value)}/>
           <button onClick={handleclick}>fetch post</button>
           <h1>{post.title}</h1>

        </div>
    )


}
export default HookDatafetching2