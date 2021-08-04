console.clear();

// variables & data types
const hello = "hello 'world'"
const helloAgain = 'hello "again"'
const andOneMoreTime = `I said ${hello}`
/*
console.log(hello)
console.log(helloAgain)
console.log(andOneMoreTime)
//*/

const integer = 42
const float = 42.0

const isWarm = true
/*
if(isWarm){
  console.log("it is soooo warm")
}
//*/

// falsy/truthy
const truthyOrFalsy = ["",0,null,undefined,false,"hello",-1, 1, true, [],{}]

/*
truthyOrFalsy.forEach(val => {
   if(val){
     console.log(val," is truthy")
   }else{
     console.log(val, " is falsy")
   }
})
//*/

// fun fun function
//console.log(sayHello("Frank"))
function sayHello(name){
    return `hello ${name}`
}
//console.log(sayHello("Peter"))

const shout = (name) => {
    return name.toUpperCase()+"!!"
}
const shoutAlias = shout
//console.log(shoutAlias("Peter"))

const simpleArrow = (name) => name.repeat(3)
// same as
const simpleArrow2 = (name) => {
    return name.repeat(3)
}
//console.log(simpleArrow("Gwen"))
//console.log(simpleArrow2("Gwen"))

const greetThemAll = (one,two,three) => {
    console.log("hello", one)
    console.log("hello", two)
    console.log("hello", three)
}

//greetThemAll("Paul","Miriam")

// arrays
const myArray = [1,2,"ffoba",{}]
console.log(myArray[2])
console.log(myArray.length)
myArray.push("i am new")
console.log(myArray)

// objects
const person = {
    name: "Jane Doe",
    role: "Admin"
}
console.log(person.name)
person.role = "User"
person.favoriteNumber = 42
console.log(person)
/*
person = {
  name: "John Doe",
  role: "Admin"
}
*/
console.log(person)
const copyOfPerson = {
    ...person,
    role: "new role"
}
console.log(copyOfPerson)

// array methods
