# event stack

>Event-stack is not call-stack.

The event stack holds all the events need to be executed like `setTimeout`, `setInterval`, `click` etc but call stack holds all the execution sequence in the javascript

So never confused with call-stack

###### Examle

Consider the following code snippet:

```javascript
for (var i = 0; i < 5; i++) {
  var btn = document.createElement('button');
  btn.appendChild(document.createTextNode('Button ' + i));
  btn.addEventListener('click', function(){ console.log(i); });
  document.body.appendChild(btn);
}
```

1. What gets logged to the console when the user clicks on “Button 4” and why?
2. Provide one or more alternate implementations that will work as expected.

The answer will be sock you. 
The loop with create 5 button with 0,1,2,3,4 but when you will click on the button then it will always print `5`.
Let deep dive into it.

1. No matter what button the user clicks the number 5 will always be logged to the console. This is because, at the point that the onclick method is invoked (for any of the buttons), the for loop has already completed and the variable i already has a value of 5. (Bonus points for the interviewee if they know enough to talk about how execution contexts, variable objects, activation objects, and the internal “scope” property contribute to the closure behavior.)

2. The key to making this work is to capture the value of i at each pass through the for loop by passing it into a newly created function object. Here are four possible ways to accomplish this:

you can solve this by many wasy

```javascript
for (var i = 0; i < 5; i++) {
  var btn = document.createElement('button');
  btn.appendChild(document.createTextNode('Button ' + i));
  (function (i) {
    btn.addEventListener('click', function() { console.log(i); });
  })(i);
  document.body.appendChild(btn);
}
```