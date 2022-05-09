# variable

JavaScript variable, there cast and order is one of the import good to know thing in javascript as they behave differently in compairable to other language.

for example `true + true` will give you little different result as might be expected. In some other programming langulage you might think if its really posible.

```javascript
console.log(true + true); //2
console.log(true+1+1); // 3

// now what will be the output of this
console.log(true+1+1+''); // 3 
console.log(true+1+1+'me'); // 3me
 
```
So its important to know in deep what is happening behind the seene with javascript variables and exactly while they are parsed to other.

