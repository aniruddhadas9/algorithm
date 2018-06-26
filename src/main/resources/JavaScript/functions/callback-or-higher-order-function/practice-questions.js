function mul(x){
    return function(y){
        return [x*y, function(z){
            return x*y + z;
        }];
    }
}

console.log(mul(2)(3)[0]);
console.log(mul(2)(3)[1](4));

// output will be 6 10

// more details
m = mul(11); // this will return a function as expected
/*
ƒ (y){
    return [x*y, function(z){
        return x*y + z;
    }];
}*/
n = m(10); // this will return an array with 2 values, 1st value and 2nd a function which can be called.
// (2) [110, ƒ]

n[0]; // will be 110
n[1](100); // will be 210

// EXAMPLE 2
function mul(x) {
    return function(y) {
        return {
            result: x * y,
            sum: function(z) {
                return x * y + z;
            }
        };
    };
}
console.log(mul(2)(3).result);
console.log(mul(2)(3).sum(4));
// 6 10


// EXAMPLE 3
function mul(x) {
    return function(y) {
        return function(z) {
            return function(w) {
                return function(p) {
                    return x * y * z * w * p;
                };
            };
        };
    };
}
console.log(mul(2)(3)(4)(5)(6));
// 720