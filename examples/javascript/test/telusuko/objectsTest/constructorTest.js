function Person(fistName,lastName){
    this.fistName = fistName;
    this.lastName = lastName;

    this.getName = function getName (){
       return (`${this.fistName} ${this.lastName}`);
    }
}

let p1 = new Person(`siva`,`konda`);
let p2 = new Person(`swetha`, `somula`);

console.log(p1.fistName,p1.lastName);
console.log(p2.fistName,p2.lastName);
console.log(p1.getName());

