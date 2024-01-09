let person1 = {

    fistName: `siva`,
    lastName:  `konda`, 
    sleep: function (){console.log(`sleeping`);},
    eat:  () => console.log(`eating`),
    getName : function () {console.log(`${this.fistName} ${this.lastName}`);},
    getName1 : () => {return console.log(this.fistName," ",this.lastName);}
   
    }

let person2 = {

    fistName: `swetha`,
    lastName:  `somula`,
    sleep: function (){console.log(`sleeping`);},
    eat:  () => console.log(`eating`),
    getName : ()=> console.log(`${person2.fistName} ${person2.lastName}`),
   
};

person1.sleep();
person1.eat();
person1.getName();
person1.getName1();
person2.sleep();
person2.eat();
person2.getName();


