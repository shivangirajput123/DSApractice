const person={
        firstName:"test",
        lastName:" testing",
        age:"",
        get fullName(){
            return this.firstName + this.lastName;
        },
        set updateAge(updatedMobileNumber){
            this.mobileNUmber=updatedMobileNumber;
        }
    }
    person.updateAge=1234597655
    console.log(person);
    // console.log(person.fullName)