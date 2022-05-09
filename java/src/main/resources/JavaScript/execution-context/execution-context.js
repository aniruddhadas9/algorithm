// What will be the output of the following code:

for (var i = 0; i < 5; i++) {
    setTimeout(function() { console.log(i); }, i * 1000 );
}

//  The code sample shown will not display the values 0, 1, 2, 3, and 4 as might be expected;
// rather, it will display 5, 5, 5, 5, and 5.

// CORRECTION
for (var i = 0; i < 5; i++) {
    (function(x) {
        setTimeout(function() { console.log(x); }, x * 1000 );
    })(i);
}


// In an ES2015 context, you can simply use let instead of var in the original code:

for (let i = 0; i < 5; i++) {
    setTimeout(function() { console.log(i); }, i * 1000 );
}