# Scope


### what is function scope



### what is block scope


### what is the difference between funcrtion scope and block scope



### How var create the problem which is function scope

The below code will output `2` as this is a function scope

```javascript
var a = 3;
if(a === 3){
 var a =2;
}
console.log(a);  // the output will be 2
```


### How `let` resolves the function scope by converting them to the block scope

The below code will output 3 as it will be block scope

```javascript
let a = 3;
if(a === 3){
 let a =2;
}
console.log(a);
```
