import React from "react";

function NameList(){
    const names=["vishnu","suraj","piyush"]
    const persons=[{
        id:1,nam:"vish",age:21
    },{id:2,nam:"rajiv",age:22}]
    const personsList=persons.map(person=><h1>hi i am {person.nam} and my age is {person.age}</h1>)
    return (<div>
        {
            names.map(name=><h1>hi {name}</h1>)
            
        }
        {personsList}
    </div>
    )
}
export default NameList
