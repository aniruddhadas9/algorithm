function sample(prefix, fun){
    // console.log('simple called %o, ', prefix);
    return fun();
}

// Defining a function which will return a function and also take parameters
function allCallback(functions) {

    // returning the function will be used to call
    // This will take two parameter, one is string tyoe and another is a function called callback function
    return function (prefix, callbackDefination) {

        // It will hold the processed result
        let returnValue = [];

        functions.forEach(function(fun) {
            returnValue =[ ...returnValue, ...fun()];
            // console.log('fun:%o | returnValue:%o', fun, returnValue);
        });

        // Now only return which have starts with aa
        returnValue = returnValue.filter(function ( element) {
            return element.indexOf(prefix) !== -1
        })

        // This is not returning but executing. I think you are getting confisued most of the time here.
        // Dont return this as its going to executed here
        callbackDefination(returnValue);
    }
}

// Creating on object of the function
maincall = allCallback([
    function(){ return ['aaple', 'aama'];},
    function(){ return ['abman', 'abwomen'];},
    function(){ return ['acount', 'accurate'];},
    function(){ return ['adidas', 'adaas'];}
]);

// Now calling the function with call back
maincall('aa', function(result){
    // result will hold the executed result and vailable inside function
    console.log('final result: %o', result);
});

