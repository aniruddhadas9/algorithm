/**
 *
 * @Defination 1:
 * A closure represents the variables of a function that are kept alive, even after the function returns.
 * In almost all other languages when a function returns all local variables are destroyed and the program moves on,
 * but not in JavaScript.
 *
 * In JavaScript when a variable holds a reference to a function it also maintains a second, but hidden,
 * reference to its closure, which essentially are the local variables that were present at the time of creation
 * and their current values. These variables are its scope context.
 * Let's show this with an example (note that counter() is a regular function and not a constructor function):
 */
function counter() {
    var index = 0;

    function increment() {
        index = index + 1;
        alert(index);
        return index;
    }

    return increment;
}

var userIncrement = counter();    // a reference to inner increment()
var adminIncrement = counter();   // a reference to inner increment()
userIncrement();                  // => 1
userIncrement();                  // => 2
adminIncrement();                 // => 1
adminIncrement();                 // => 2
adminIncrement();                 // => 3

/**
 * When the counter function is invoked, it returns a reference to the increment function.
 * At the time counter finishes execution, JavaScript saves its scope, and only the function that it returns,
 * in our example increment, has access to it. This is the function's closure and includes a copy of the variable index,
 * which is 0 following the initialization. Subsequent calls to increment increments the index value.
 * Note that userIncrement and adminIncrement each have their own closure with their own copy of the index variable
 * that only they can work on.
 */


/** --------------------------------------------------------------------------------------------------- */

/**
 *
 * @Defination 2
 * A closure is an inner function that has access to the variables in the outer (enclosing) function’s scope chain.
 * The closure has access to variables in three scopes;
 * specifically:
 * (1) variable in its own scope,
 * (2) variables in the enclosing function’s scope, and
 * (3) global variables.

 */





var globalVar = "xyz";
(function outerFunc(outerArg) {
    var outerVar = 'a';

    (function innerFunc(innerArg) {
        var innerVar = 'b';

        console.log(
            "outerArg = " + outerArg + "\n" +
            "innerArg = " + innerArg + "\n" +
            "outerVar = " + outerVar + "\n" +
            "innerVar = " + innerVar + "\n" +
            "globalVar = " + globalVar);

    })(456);
})(123);

/**
 *   In the above example, variables from innerFunc, outerFunc, and the global namespace are all in scope in the innerFunc.
 * The above code will therefore produce the following output:
 *
 * outerArg = 123
 * innerArg = 456
 * outerVar = a
 * innerVar = b
 * globalVar = xyz


 /**
 *
 *Another Example
 */

(function (x) {
    return (function (y) {
        console.log(x+y);
    })(2)
})(1);

// ouput: 3
// As explaned above closure have access to its outer function raviable along with its own and global.
