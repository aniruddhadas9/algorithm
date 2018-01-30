# callback or higher-order functions

Below code is a classic example of creating callback function or higher-order function

```javascript
function unless(test, then) {
  if (!test) then();
}
function repeat(times, body) {
  for (var i = 0; i < times; i++) body(i);
}

repeat(3, function(n) {
  unless(n % 2, function() {
    console.log(n, "is even");
  });
});
// → 0 is even
// → 2 is even
```

##### Higher-order function definition
Functions that operate on other functions, either by taking them as arguments or by returning them, are called higher-order functions.
If you have already accepted the fact that functions are regular values, there is nothing particularly remarkable about the fact that such functions exist.
The term comes from mathematics, where the distinction between functions and other values is taken more seriously.

Higher-order functions allow us to abstract over actions, not just values. 
They come in several forms. For example, you can have functions that create new functions.

```javascript
function greaterThan(n) {
  return function(m) { return m > n; };
}
var greaterThan10 = greaterThan(10);
console.log(greaterThan10(11));
```
And you can have functions that change other functions.

```javascript
function noisy(f) {
  return function(arg) {
    console.log("calling with", arg);
    var val = f(arg);
    console.log("called with", arg, "- got", val);
    return val;
  };
}
noisy(Boolean)(0);
// → calling with 0
// → called with 0 - got false
```

You can even write functions that provide new types of control flow.

```javascript
function unless(test, then) {
  if (!test) then();
}
function repeat(times, body) {
  for (var i = 0; i < times; i++) body(i);
}

repeat(3, function(n) {
  unless(n % 2, function() {
    console.log(n, "is even");
  });
});
// → 0 is even
// → 2 is even
```

The lexical scoping rules that we discussed in Chapter 3 work to our advantage when using functions in this way. 
In the previous example, the n variable is a parameter to the outer function. Because the inner function lives inside the environment of the outer one, it can use n. 
The bodies of such inner functions can access the variables around them. They can play a role similar to the {} blocks used in regular loops and conditional statements. 
An important difference is that variables declared inside inner functions do not end up in the environment of the outer function. And that is usually a good thing.

##### Passing along arguments

The noisy function defined earlier, which wraps its argument in another function, has a rather serious deficit.

function noisy(f) {
  return function(arg) {
    console.log("calling with", arg);
    var val = f(arg);
    console.log("called with", arg, "- got", val);
    return val;
  };
}
If f takes more than one parameter, it gets only the first one. We could add a bunch of arguments to the inner function (arg1, arg2, and so on) and pass them all to f, but it is not clear how many would be enough. This solution would also deprive f of the information in arguments.length. Since we’d always pass the same number of arguments, it wouldn’t know how many arguments were originally given.

For these kinds of situations, JavaScript functions have an apply method. You pass it an array (or array-like object) of arguments, and it will call the function with those arguments.

function transparentWrapping(f) {
  return function() {
    return f.apply(null, arguments);
  };
}
That’s a useless function, but it shows the pattern we are interested in—the function it returns passes all of the given arguments, and only those arguments, to f. It does this by passing its own arguments object to apply. The first argument to apply, for which we are passing null here, can be used to simulate a method call. We will come back to that in the next chapter.

> note: The document created from https://eloquentjavascript.net/05_higher_order.html
