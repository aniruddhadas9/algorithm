# Destructuring
Destructuring is the process of taking apart the array or object on the left hand side of the equal sign. The array or object can come from a variable, function, or equation.

```ecmascript 6
let [ a, b, c ] = [ 6, 2, 9];
console.log(`a=${a}, b=${b}, c=${c}`); //a=6, b=2, c=9
function foo() { return ['car', 'dog', 6 ]; } 
let [ x, y, z ] = foo();
console.log(`x=${x}, y=${y}, z=${z}`);  // x=car, y=dog, z=6
```

With object destructuring, the keys of the object can be listed inside curly braces to extract that key-value pair.

```ecmascript 6
function bar() { return {a: 1, b: 2, c: 3}; }
let { a, c } = bar();
console.log(a); // 1
console.log(c); // 3
console.log(b); // undefined
```

Sometimes, you want to extract the values but assign them to a new variable. This is done using a 'key: variable' pairing on the left of the equals sign.

```ecmascript 6
function baz() { 
    return {
        x: 'car',
        y: 'London',
        z: { name: 'John', age: 21}
    }; 
}
let { x: vehicle, y: city, z: { name: driver } } = baz();
console.log(
    `I'm going to ${city} with ${driver} in their ${vehicle}.`
); // I'm going to London with John in their car. 
```


Another thing that object destructuring allows is assigning a value to multiple variables.

```ecmascript 6
let { x: first, x: second } = { x: 4 };
console.log( first, second ); // 4, 4

```