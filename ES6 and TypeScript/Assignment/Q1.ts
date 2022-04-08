//Q1
const a="vishnu"
//const a=     //we can not change the value of a because we have defined it as const
//Q2
const vish=function(a){
    if(a>10){
        let b=10
        return (a*b);
    }
    else{
        //b        //b is not accesible outside if condition this is an example of scoping
      return a;
    }
}
console.log(vish(15));

//Q3
 let order={
    id:1,
    title:"biryani",
    price:150,
     printOrder:function(){
        return (`id = ${this.id} , title =${this.title} , price =${this.price}` );
    },
    getprice:function(){
        return (`price=${this.price}`);
    }
} 
let newobj=Object.assign({},order);
console.log(newobj);
console.log(order.printOrder());
console.log(order.getprice());

//Q4
let names=['Tom','Ivan','jerry']
const output=names.map(value=>({names1:value,lengt:value.length}));

console.log(output);
//Q5 a
let add=function(a:number,b:number){
    return a+b;
}
console.log(add(10,20));

//Q5 b
let usernam="vishnu";
let userfriends=function(usernam,...userfriend){
    console.log(usernam);
    console.log("List of friends");
    
    
    for(let i in userfriend){
        console.log(userfriend[i]);
    }
}
userfriends(usernam,"suraj","Rajiv","divyansh","shivam","Piyush")

//Q5 c
let name2=["suraj","vishnu","piyush","rajiv","Divyansh"] //list of names in array
let printcapitalNames=function(...name1){
     console.log("NAMES");
      
    for (let i in name1){
     console.log(name1[i].toUpperCase()); //printing the elements in upper case
     }

}
printcapitalNames(...name2)//using spread operator to split elements of array


//Q6
function laptop(model:string,deskno:any,name:string){
    return(`modelname=> ${model}, deskno=> ${deskno} ,name =>${name} `)
}
console.log(laptop("lenovo Ideapad i7",330,"vishnu"));

//Q7
 
let ab=[1,2,3,4]
let[value1,value2,value3,value4]=ab
console.log(value3);

//Q7 b
let organization ={ 
    Name:"Capgemini" ,
    adress : {
        city:"mumbai",
        state:"Maharastra",
        pincode:  400703
    }
};
let {adress:{pincode: p}} = organization;
console.log(p);