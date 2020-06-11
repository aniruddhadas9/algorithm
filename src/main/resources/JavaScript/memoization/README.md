What is memoization?
Memoization is an optimization technique that is used to improve the performance of a function by caching its return values so that it does not need to redo the potentially heavy computations next time it is called.

Not all functions can be memoized; only referential transparent functions. A referential transparent function is one that always produces the same output on a given input. For instance, if you invoke a function with a value x passed to it, it will perform calculations on x and always returns the same associated y value.

Good examples of where memoization can be beneficial are HTML5 Canvas animations and recursive mathematical calculations, such as, factorial computation, generating Fibonacci sequences, and matrix chain multiplications.

Let's look at how memoization can be used to improve computing the Fibonacci numbers. The recursive approach to generating these numbers does not scale very well. In the example below the getFibonacci function is recursively called 177 times to generate the sum of the first 10 Fibonacci numbers:

```javascript
function getFibonacci (num) {
  if (num < 2) {
      return num;
  }
  return getFibonacci(num - 1) + getFibonacci(num - 2);
}
alert(getFibonacci(10));     // => 55   (with 177 iterations)

```
The program does a lot of extra work by not keeping track of previously calculated values. This is where memoization comes in. First, declare a cache array where you can store the already-calculated function values that were returned in previous calls. Then, instead of invoking the function, return these values in subsequent calls to the function, like so:

```javascript
function getFibonacci (num) {
    var cache = [];
    var fib = function(value) {
        if(value < 2 ) return value;
        if( cache[value] ) return cache[value];
    
        cache[value] = (fib(value -1)) + (fib(value-2));
        return cache[value];
    };
    return fib(num);
}
alert(getFibonacci(10));     // => 55   (with 20 iterations)
```


To generate the first 10 Fibonacci numbers, this function is recursively executed 20 times only. A significant improvement.
