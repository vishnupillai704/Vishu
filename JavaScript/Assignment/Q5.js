function Name(){
    var result= alert("In this Input field you should write your name")
    return result;
}
function Email(){
    var result1= alert("In this Input field you should write your email id")
    return result1;
}
function Toppings(){
    var result2=alert("In this You should select what type of toppings do you want in pizza")
}
function Delivery(){
    var result3=alert("In which medium do you want to get pizza")
}

function Tip(){
    var result4=alert("how much percent amount do you want to contribute to delivery boy")
    return result4;
}

function Address(){
    var result5=alert("write address for delivery of pizza")
     return result5; 
}
function help(){
    var result6=alert("This text area provide context-sensitive help click on any input field to get more information about the input field")
    return result6;
    
}
  
   
    
   

   
    
    
function Submi(){
    
    var nam = document.getElementById("CustomerName").value;
    var emai = document.getElementById("Email").value;
    let tip = document.querySelector('#Tip').value;
    let delivery = document.querySelector('input[name="pizza"]:checked').value;
    var address = document.getElementById("address").value;
    let toppings = document.querySelector('input[name="Toppings"]:checked').value;
    let toppings1 = document.querySelector('input[name="Toppings1"]:checked').value;
    let toppings2 = document.querySelector('input[name="Toppings2"]:checked').value;
    

    document.write("customer name : " + nam)
    document.write(" custome email : " + emai)
    document.write(" Customer Tip : " + tip)
    document.write("  Delivery ? " + delivery)
    document.write(" address : " + address)
    document.write(" toppings : " + toppings)
    document.write(" toppings1 : " + toppings1)
    document.write(" toppings2 : " + toppings2)
}





