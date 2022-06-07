const obj=new Object();
obj.firstName="Test";
obj.lastName="testing";
obj.age=23;
// console.log(obj);

obj.cars={category: ["Vintage","Sports",""]}
obj.cars.category.map((value)=>{
    // console.log(value)
});

//for making in array:-
const objKeys=[]
const objValues=[];
for(let key in obj){
    objKeys.push(key);
    objValues.push(obj[key]);
}
// console.log(objKeys, objValues);
// console.log(objKeys);
// console.log(objValues);

// **this propert**//

