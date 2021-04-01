// What is the value of typeof undefined == typeof NULL?

console.log( typeof undefined == NULL); // Javascript error. null is always in small. NULL will be treated as undefined
```
Uncaught ReferenceError: NULL is not defined
at <anonymous>:1:34
(anonymous) @ VM36:1
```
console.log( typeof undefined == null);  // this will be false as null tyoe is object not undefined

/*
The expression will be evaluated to true, since NULL will be treated as any other undefined variable.

Note: JavaScript is case-sensitive and here we are using NULL instead of null
 */

console.log(typeof typeof 1);

/*
string

typeof 1 will return "number" and typeof "number" will return string.
 */
