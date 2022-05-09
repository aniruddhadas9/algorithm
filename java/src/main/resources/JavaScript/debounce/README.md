## Debouncing

There are some browser events that can fire many times within a short timespan very quickly, such as resizing a window or scrolling down a page.
If you attach an event listener to the window scroll event for example, and the user continuously scrolls down the page very quickly, your event may fire thousands of times within the span of 3 seconds.
This can cause some serious performance issues.

If you’re discussing building an application in an interview, and events like scrolling, window resizing, or key pressing come up, make sure to mention debouncing and/or throttling as a way to improve page speed and performance.
A real example taken from this guest post on css-tricks:

In 2011, an issue popped up on the Twitter website: when you were scrolling down your Twitter feed, it became slow and unresponsive. John Resig published a blog post about the problem where it was explained how bad of an idea it is to directly attach expensive functions to the scroll event.
Debouncing is one way to solve this issue by limiting the time that needs to pass by until a function is called again. A correct implementation of debouncing would therefore group several function calls into one and execute it only once after some time has elapsed. Here’s an implementation in plain JavaScript that makes use of topics such as scope, closures, this, and timing events:

```javascript
// debounce function that will wrap our event
function debounce(fn, delay) {
  // maintain a timer
  let timer = null;
  // closure function that has access to timer
  return function() {
    // get the scope and parameters of the function 
    // via 'this' and 'arguments'
    let context = this;
    let args = arguments;
    // if event is called, clear the timer and start over
    clearTimeout(timer);
    timer = setTimeout(function() {
      fn.apply(context, args);
    }, delay);
  }
}
```

This function — when wrapped around an event — will execute only after a certain amount of time has elapsed.

You would use this function like so:

```javascript

// function to be called when user scrolls
function foo() {
  console.log('You are scrolling!');
}

// wrap our function in a debounce to fire once 2 seconds have gone by
let elem = document.getElementById('container');
elem.addEventListener('scroll', debounce(foo, 2000));

```

Throttling is another technique that’s is similar to debouncing, except that instead of waiting for some time to pass by before calling a function, throttling just spreads the function calls across a longer time interval. So if an event occurs 10 times within 100 milliseconds, throttling could spread out each of the function calls to be executed once every 2 seconds instead of all firing within 100 milliseconds.

For more information on debouncing and throttling, the following articles and tutorials may be helpful:
