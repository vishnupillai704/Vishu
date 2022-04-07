// function greetPerson(name){
//     let greet;
//     if(name=="vishnu"){
//          greet="hi vishnu"
//     }
//     else{
//          greet=" hi "
//     }
//     console.log(greet)
// }
// greetPerson("vish")
// let namw;//you can declare let without any value
// const nam={name:"vishnu"};//you can not declare const without any value
// console.log(nam.name)
// // const nam={} you can not redeclare obj of const,but you redeclare value of const.
// nam.name="suraj"
// console.log(nam.name)
// var find=function(x){
//     return x;
// }
// console.log(find(5))
// const find1=(x)=>{return x;} //const is alternative and simple way to use function
// console.log(find1(10))
// const value=(v=10,bonus=5)=>{ console.log(v+bonus)};//here we are giving default value to v and bonus(this we can not do is js)
// value();
// value(1,2);// we can also provide  value instead of default value
// value(2)//here 2 value would be default
// value(undefined,2)//here 1 value would be default
// let message="colors list"
// let displaycolor=function(message,...colors){ //(...)is the symbol of rest operator which means that you can provide any no variables in that 
//     console.log(message)
//     for(let i in colors){ //rest operator makes variable type into array(here we are iterating through the list)
//         console.log(colors[i])
//     }
// }
// displaycolor(message,"red","blue") //here we can pass any no of variable becuse of rest operator
// displaycolor(message,"pink","orange","blue","green")
// displaycolor(message,"black")
//  let message="color list"                           //rest operator is specified on function declaration
// let displaycolor= function(message,...colors){ //rest operator convert individual elements into array
//     console.log(message)
//     for (let i in colors){
//         console.log(colors[i])
//     }
// } 
// let colorArray=["green","white","yellowish"]
// displaycolor(message,...colorArray)//here spreadoperator split the array into individual elements 
//spread operator is specified on function call
// let createperson=function(firstname,lastname,age){
//     let fullname=firstname+" "+lastname;
//     return {firstname,
//         lastname,
//         fullname,
//         issenior:function(age){
//             if(age>60){
//                 console.log("seniorcitizen");
//             }
//             else{
//                 console.log("not a senior citizen")
//             }
//         }};
// }
// let v=createperson("vishnu","pillai",20)
// console.log(v.firstname);
// console.log(v.lastname);
// console.log(v.fullname);
// console.log(v.issenior(9));
// let employee=["vishnu","pillai"]
// let [firstname,lastname,gender="male"]=employee;//this is called destructuring of  array,you can also provide default value
//  console.log(firstname);
//  console.log(lastname);
//  console.log(gender);
// let employee={
//     firstname:"suraj",
//     lastname:"patra",
//     age:"21"
// }
//  let {firstname,lastname,age}=employee; //destructuring of objects
//  console.log(firstname);
//  console.log(lastname);
//  console.log(age);
// let user="vishnu"
// // let greet="welcome" +user+ lname+"!" //we use to do like this in java script
// let lname="pillai"
// let greet=`welcome ${user} ${lname} !`
// console.log(greet);
// let vis=["vis","pis","kis"]
// for(let i in vis ){
//     console.log(vis[i]);//we used to do like this before but there is a new syntax for of loop which is used only in iterables.
// }
//  for( let i of vis){
//      console.log(i);
// }
// // we can iterate through string also by for of loop
//  let mis="vishnu";
//  for(let io of mis){
//      console.log(io); //in this each element of string  will be printed out
//     }
//  class person{
//      constructor(name){
//          console.log("welcome" + name); // this keyword can not be used here
//      }
//  }
// let p= new person("vish");
// class vishh{
//     constructor(name){   
//          console.log("welcome" +name)
//     }
//     getid=()=>{return 10 }
// }
//  class sura extends vishh{
//      constructor(name){
//          super(name); //to call the above constroctor
//          console.log(name +" employee constructor")
//      }
//      getid=() =>{
//         // return super.getid; to get parent id
//          return 20;
//      }
//  }
//  let c=new sura("vishnu")
//  console.log(c.getid());
// let myset=new Set();
// myset.add("vishnu");
// myset.add("pillai");
// myset.add("vishnu");// set does not take duplicate copies
// myset.add(1);
// console.log(myset.size);
// console.log(myset.has("vishnu"));// to check value is present or not
// console.log(myset.delete("pillai"));//to delete element d=from set
// console.log(myset.size);
// let myMap =new Map();
// myMap.set("name","vishnu");
// myMap.set("age",21)
// myMap.set("place","ghaziabad")
// console.log(myMap.get("name")); //this will get a particular key
// console.log(myMap.has("age")); //check a particular key
// console.log(myMap.size); //gives size of map
// console.log(myMap.delete("place")); 
// console.log(myMap.size);
var mymap1 = new Map([["name", "vishnu"], ["age", "21"]]);
for (var _i = 0, _a = mymap1.keys(); _i < _a.length; _i++) {
    var key = _a[_i];
    console.log(key);
}
for (var _b = 0, _c = mymap1.values(); _b < _c.length; _b++) {
    var value = _c[_b];
    console.log(value);
}
for (var _d = 0, _e = mymap1.entries(); _d < _e.length; _d++) {
    var _f = _e[_d], key = _f[0], value = _f[1];
    console.log("".concat(key, "->").concat(value));
}
