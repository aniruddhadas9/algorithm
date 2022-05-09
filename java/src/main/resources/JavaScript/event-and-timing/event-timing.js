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



// same way what will be the output of the following code:

for (var i = 0; i < 5; i++) {
    setTimeout(function() { console.log(i); }, i * 1000 );
}
// 5,5,5,5,5

// same way what will be the output of the following code.
// NOTE: let instead of var
for (let i = 0; i < 5; i++) {
    setTimeout(function() { console.log(i); }, i * 1000 );
}

//1,2,3,4,5