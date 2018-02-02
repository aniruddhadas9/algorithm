/*

For the detail follow the link: http://javascript.info/settimeout-setinterval


 */

(function() {
    console.log(1);
    setTimeout(function(){console.log(2)}, 1000);
    setTimeout(function(){console.log(3)}, 0);
    console.log(4);
})();

// The output of the above program will be 1,4,3,2 because of the call stack arrangement i think