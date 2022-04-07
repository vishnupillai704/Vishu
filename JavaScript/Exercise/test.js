// javaScript 1 Assignment
 var parity=function(a){
    if((a%2)==0){
        document.write("even")
    }
      else{
        document.write("odd")
    }
};

var max=function(a,b,c){
    if(c>a && c>b){
        document.write("max is"+c)
    }
    else if(b>c && b>a){
        document.write("max is "+b)
    }
    else if(a>b && a>c) {
        document.write("max is" +a)
    }
};

var x=5

function half(x){
    return(x/2);
}
half(x)
half(3)

function seven(){
    x=7
    return x;
}
seven()
x

var calculation=function(a,b,c){
    document.write((a+b)/c)
}
calculation(1,1,0)
calculation(-1,-1,0)
calculation(1,-1,0)


function greeting(name){
    return   "Hello" + name ;
}
undefined
function Q2() {
    var v = prompt('Enter The Name');
    alert(greeting(v));
}


var named=function(a){
    if(a=="Alice"|| a=="Bob"){
        document.write("welcome"+a)
    }
    else{                                                                                                     document.write("not valid")}                                                                        }
undefined
named("suraj")
undefined
named("Alice")
undefined
named("Bob")

var num=function(a){
    for(i=0;i<a;i++){
        document.write( b=a+i)}
}

var multi=function(a){
    for(i=1;i<=10;i++){
        b=a*i;
document.write(""+b)}    
}

document.write(Math.max(1 , 3 , 2 ));

document.write(Math.max(-1 , -3 , -2 ));

const array1 = [1 , 3 , 2 ];

document.write(Math.max( ...array1));


const array2 = [1 , 3 , 2 ];
var revvis= [].concat(array2).reverse();
document.write(revvis);

// #functional programming
function square(x){
    return (x*x);}
function double(x){
    return(x*2);}
function composedvalue(x){
 return square(double(x));} 
composedvalue(5) 

var f1=function compose(square,double){
    return square(double(x));}
undefined
var f1=function compose(x){
    return square(double(x));}
undefined
var f2=function compose(x){
    return double(square(x));}
undefined
f2(5)
50
f2(10)
200
f1(5)
100
f1(10)
400

// #Functional Programming
function iseven(x){
    if(x%2==0){
        return x%2==0;
    }
}
function find1(f,arr){
    var arr2=[];
    for(i=0;i<arr.length;i++){
      arr2.push(f(arr[i]));}
    return arr2;}
    find1(iseven,arr)

arr=[1,2,3,4]; 
function map(f,arr){
    var arr2=[];
     for(var i=0;i<arr.length;i++){
         arr2.push(f(arr[i]));}
         return arr2;
    }
         map(square,arr);

// function Advanceexercise
const isEven = (num) => num % 2 == 0; 
let arr=[1,3,5,4,2];
const Sqr = (num) => num * num;
var resarr = [];
function find(arr, func) {
    if(func(arr.slice(0,1))){return arr.slice(0,1);}
    else{
    arr= arr.slice(1,(arr.length));
    return find(arr,func);
    }
}

function map(arr,fun){
    if(arr.length==0){
        return resarr;}
    else{
    resarr.push(fun(arr.slice(0,1)))
    console.log(resarr);
    arr= arr.slice(1,(arr.length));
    return map(arr,fun);
    }
}

// objectsAssignment
class Rectangle{
    constructor(width,height){
        this.width=width;
        this.height=height;}
    getArea=()=>{return this.width*this.height;};
    getPerimeter=()=>{return 2*(this.width*this.height);};}
undefined
r=new Rectangle(2,4);
r.getArea();
r.getPerimeter();

var Myobject={FirstName:"VISHNU",LastName:"PILLAI",City:"Ghaziabad",country:"India"};
undefined
Myobject.City
Myobject.FirstName
Myobject.city="MohanNagar"
Myobject.city


var Myobject={FirstName:"VISHNU",LastName:"PILLAI",MiddleName:"NIL",City:"Ghaziabad",country:"India"};
Myobject.MiddleName
Myobject.MiddleName="NONE"
Myobject.MiddleName


var string = "{firstName:'shruti', age:19, city:'Brahampur', state:'Odisha', country:'India'}";
eval('var obj='+string);
console.log(obj);
obj.age=20;


class person {
    constructor(fname,lname,age,skills,dateofbirth,address,married,profession){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.skills=skills;
        this.dateofbirth=dateofbirth;
        this.address=address; 
        this.married=married;
        this.profession=profession;
    }}
    person1=new 
person("nikhil","goud",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")

person2=new 
person("harish","chinna",21,"HTML","08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jr analyst")
person1.age
person2.age
amithab=new person("amithab","bachan",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")
abhisheik=new person("abhisheik",21,"HTML","08/06/1997","false","jr analyst")
var abhisheik=Object.create(amithab);
undefined
abhisheik.lname
var aradhya=Object.create(amithab);

 
