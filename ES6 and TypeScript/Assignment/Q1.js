//Q1
var a = "vishnu";
//const a=     //we can not change the value of a because we have defined it as const
//Q2
var vish = function (a) {
    if (a > 10) {
        var b = 10;
        return (a * b);
    }
    else {
        //b        //b is not accesible outside if condition this is an example of scoping
        return a;
    }
};
console.log(vish(15));
//Q3
var order = {
    id: 1,
    title: "biryani",
    price: 150,
    printOrder: function () {
        return ("id = ".concat(this.id, " , title =").concat(this.title, " , price =").concat(this.price));
    },
    getprice: function () {
        return ("price=".concat(this.price));
    }
};
var newobj = Object.assign({}, order);
console.log(newobj);
console.log(order.printOrder());
console.log(order.getprice());
//Q4
var names = ['Tom', 'Ivan', 'jerry'];
var output = names.map(function (value) { return ({ names1: value, lengt: value.length }); });
console.log(output);
//Q5 a
var add = function (a, b) {
    return a + b;
};
console.log(add(10, 20));
//Q5 b
var usernam = "vishnu";
var userfriends = function (usernam) {
    var userfriend = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        userfriend[_i - 1] = arguments[_i];
    }
    console.log(usernam);
    console.log("List of friends");
    for (var i in userfriend) {
        console.log(userfriend[i]);
    }
};
userfriends(usernam, "suraj", "Rajiv", "divyansh", "shivam", "Piyush");
//Q5 c
var name2 = ["suraj", "vishnu", "piyush", "rajiv", "Divyansh"]; //list of names in array
var printcapitalNames = function () {
    var name1 = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        name1[_i] = arguments[_i];
    }
    console.log("NAMES");
    for (var i in name1) {
        console.log(name1[i].toUpperCase()); //printing the elements in upper case
    }
};
printcapitalNames.apply(void 0, name2); //using spread operator to split elements of array
//Q6
function laptop(model, deskno, name) {
    return ("modelname=> ".concat(model, ", deskno=> ").concat(deskno, " ,name =>").concat(name, " "));
}
console.log(laptop("lenovo Ideapad i7", 330, "vishnu"));
//Q7
var ab = [1, 2, 3, 4];
var value1 = ab[0], value2 = ab[1], value3 = ab[2], value4 = ab[3];
console.log(value3);
//Q8
var organization = {
    Name: "Capgemini",
    adress: {
        city: "mumbai",
        state: "Maharastra",
        pincode: 400703
    }
};
var p = organization.adress.pincode;
console.log(p);
