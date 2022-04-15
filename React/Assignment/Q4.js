import React,{useState} from "react";
import './Q4.css'

function Q4(){
    const[result,setresult]=useState("")
    const handleclick=(e)=>{
        setresult(result.concat(e.target.name));
    }
    const clear=()=>{
        setresult("");
    }
    const backspace=()=>{
       setresult(result.slice(0,result.length-1));
    }
    const calculate=()=>{
        try{
            setresult(eval(result).toString());
        }
        catch{
            setresult("error")
        }
    }
    return(
        <div className="container">
            <form>
                <input type="text" value={result} />
            </form>
        
        <div className="keypad">
            <button className="highlight" onClick={clear} id="clear">clear</button>
            <button className="highlight" onClick={backspace} id="backspace">C</button>
            <button className="highlight" name="/" onClick={handleclick}>&divide;</button>
            <button name="7" onClick={handleclick}>7</button>
            <button name="8"onClick={handleclick}>8</button>
            <button name="9"onClick={handleclick}>9</button>
            <button className="highlight" name="*"onClick={handleclick}>&times;</button>
            <button name="4"onClick={handleclick}>4</button>
            <button name="5"onClick={handleclick}>5</button>
            <button name="6"onClick={handleclick}>6</button>
            <button className="highlight" name="-"onClick={handleclick}>&ndash;</button>
            <button name="1"onClick={handleclick}>1</button>
            <button name="2"onClick={handleclick}>2</button>
            <button name="3"onClick={handleclick}>3</button>
            <button className="highlight" name="+"onClick={handleclick}>+</button>
            <button name="0"onClick={handleclick}>0</button>
            <button name="."onClick={handleclick}>.</button>
            <button className="highlight" onClick={calculate} id="result">=</button>

        </div>
        </div>
    )
}
export default Q4