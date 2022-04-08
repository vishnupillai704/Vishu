//Q1
var Fibonacci = /** @class */ (function () {
    function Fibonacci() {
        this.previousNo = Symbol();
        this.currentNo = Symbol();
        this.previousNo = 0;
        this.currentNo = 1;
    }
    Fibonacci.prototype.next = function () {
        var nxt = Symbol();
        nxt = this.previousNo + this.currentNo;
        this.previousNo = this.currentNo;
        this.currentNo = nxt;
        return nxt;
    };
    return Fibonacci;
}());
var obj = new Fibonacci();
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
//Q2
var listArmStrong = [0, 1, 153, 370, 371, 407];
var n = 0;
function Q2() {
    return { getNextArmstrong: function () { n += 1; return { value: listArmStrong[n], done: false }; } };
}
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
var printusers = function (room, name) {
    console.log("Users in room name  ".concat(name, " are : "));
    for (var _i = 0, _a = room.keys(); _i < _a.length; _i++) {
        var key = _a[_i];
        console.log(key);
    }
};
var printmessages = function (room, name) {
    console.log("Messages in room name  ".concat(name, " are : "));
    for (var _i = 0, _a = room.values(); _i < _a.length; _i++) {
        var value = _a[_i];
        console.log(value);
    }
};
printusers(croom1, "room1");
printusers(croom2, "room2");
printmessages(croom1, "room1");
printmessages(croom2, "room2");
