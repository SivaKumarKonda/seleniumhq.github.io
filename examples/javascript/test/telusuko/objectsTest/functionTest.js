function sayHi(){
    console.log(`hi siva`);
}

function sayHiReturn(){
    return `sayHiReturn`;
}

function sayHiParam (user){

    return `hi ${user}`
}


sayHi();
console.log(sayHiReturn());
console.log(sayHiParam("sayHiParam"));


//function expression
let func1 = function () {console.log("func1")};

func1();
