let person = {
    fistName:`siva`,
    lastName:`konda`,
    address:{
        city:`nandyal`,
        pin:`518502`
    }
}

for (let k in person){

    console.log(`${k} :${person[k]}`);
    console.log(`${k} :${person[k]}`);
}

for (let k in person.address){

   
    console.log(`${k} :${person.address[k]}`);
}