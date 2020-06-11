What is currying?
In situations where a function is repeatedly called with mostly the same arguments, you may have a candidate for currying. To curry a function is essentially caching and reusing argument values.

A curried function uses a closure to cache the state of recurring arguments so that you don't need to pass them every time. The new function then uses them to pre-populate the entire list of arguments that the original function requires.

The input to the currying process is a function that accepts two or more arguments. It then transforms the function to produce a new function that offers the similar functionality but with partial (fewer than the original) arguments. It binds the rest of the arguments to fixed values.

Let's look at an example. The function name accepts two arguments for first name and last name: first and last. It concatenates them to generate the person's name.

```javascript
function name (first, last) {
    return first + " " + last;
}
alert(name("Joni", "Mitchell"));
```

Next, we create a curried version of the same function. If we pass two arguments it executes normally, just like the example above. If, however, we only pass the first argument, then an another function is returned with its closure which holds the first value. The returned function accepts a partial list of arguments, in our example, just one argument which is last because it already knows what the first value is. Again, it performs the same job as name, but the value of first is remembered in the closure associated with the anonymous helper function that is returned.

```javascript
function name (first, last) { 
    if (typeof last === 'undefined'){
       return function(last) {   // curry function, creates a closure
            return first + " " + last; 
       };
    }
    return first + " " + last;
}
alert(name("Joni", "Mitchell"));    // => Joni Mitchell
var partialName = name("Joni");
alert(partialName("Mitchell"));     // => Joni Mitchell
alert(partialName("McNamara"));     // => Joni McNamara
```

In JavaScript, a function needs a helper function to achieve currying. This helper function is commonly referred to as the curry function.

There is a generic implementation of currying that can be applied to any function and the code below demonstrates this. It creates a closure that stores both the original function and the arguments to curry. Then, when called again, it concatenates the incoming arguments with the prior array of arguments and executes the original function. One array holds the arguments passed to the current invocation and the other array holds the arguments passed to the curry function. The concatenated array is then passed to the original function.

```javascript
Function.prototype.curry = function () {
   var f = this;
   var curryArgs = Array.prototype.slice.call(arguments);
        
   // Return a function that returns the result 
   // of invoking the original function
   return function () {
       return f.apply(this, curryArgs.concat(
                      Array.prototype.slice.call(arguments)));
   };
};
function show(message) {
    alert(message);
}
    
var joke = show.curry("Two friends walk into a bar...");
joke();       // Two friends walk into a bar..
joke();       // Two friends walk into a bar..
joke();       // Two friends walk into a bar..
```
