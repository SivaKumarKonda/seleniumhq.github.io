let person = {
    fistName:`siva`,
    lastName:`konda`,
    address:{
        city:`nandyal`,
        pin:`518502`
    }
}

console.log(person);
console.log(person.address.city);
console.log(person.address.city.length);
console.log(person.address.city1?.length);
console.log(person.address.city?.length);

delete person.address.city;

console.log(person);
console.log(person?.address.city);

