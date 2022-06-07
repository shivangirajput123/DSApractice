//**SIMLER OR LITRAL OBJECTS**

const eaxampleKey="Gender";
const obj1= {firstName: "", lastName: ""};
//Inserting extras
obj1.age=23;
obj1["firstName"]="tEST";
//assigning variable value
obj1[eaxampleKey]="Male/Female";
//
const obj2=new Object();
obj1=obj2;
console.log(obj1);
obj2.type="teting";
// console.log(obj1, obj2);