// const person={
//     firstName:"test",
//     lastName:" testing",
//     age:23,
//     fullName: function(){
//         return this.firstName + this.lastName;
//     }
// }
// console.log(person.fullName())
console.log(this)
//or
const person={
    firstName:"test",
    lastName:" testing",
    age:23,
    fullName: function(firstName, lastName){
        return firstName + lastName;
    }
}
// console.log(person.fullName())
console.log(person.fullName(person.firstName + person.lastName))



