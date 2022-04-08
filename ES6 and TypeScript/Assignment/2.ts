//Q1
class Fibonacci{
    previousNo=Symbol();
    currentNo=Symbol();
    constructor(){
        this.previousNo=0;
        this.currentNo=1;
    }
    next(){
        let nxt=Symbol();
        nxt = this.previousNo + this.currentNo;
        this.previousNo=this.currentNo;
        this.currentNo=nxt;
        return nxt;
    }
}
let obj=new Fibonacci();
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
//Q2
const  listArmStrong=[0, 1, 153, 370, 371, 407];
let n = 0;
function Q2() {
    return { getNextArmstrong : function() {n += 1; return { value: listArmStrong[n], done: false };}};}
var n1 = Q2();
console.log("Armstrong numbers are : ");
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());

//Q4
var croom1 = new Map();
var croom2 = new Map();
croom1.set("user1", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom1.set("user2", ["Hi", "How are you?", "I am fine", "Thank you"]);
croom1.set("user3", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user4", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user5", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user6", ["Hello", "How are you?", "I am fine", "Thank you"]);
var printusers= (room,name)=>{
    console.log(`Users in room name  ${name} are : `);
    for(let key of room.keys()){console.log(key);}
}
var printmessages= (room,name)=>{
    console.log(`Messages in room name  ${name} are : `);
    for(let value of room.values()){console.log(value);}
}
printusers(croom1,"room1");
printusers(croom2,"room2");
printmessages(croom1,"room1");
printmessages(croom2,"room2");