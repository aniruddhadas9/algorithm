var obj = {a: 1 ,b: 2}
var objclone = Object.assign({},obj);

/*
Now the value of objclone is {a: 1 ,b: 2} but points to a different object than obj.

Note the potential pitfall, though: object.clone() will just do a shallow copy, not a deep copy.
 This means that nested objects aren’t copied. They still refer to the same nested objects as the original:
*/
    let obj = {
        a: 1,
        b: 2,
        c: {
            age: 30
        }
    };

var objclone = Object.assign({},obj);
console.log('objclone: ', objclone);

obj.c.age = 45;
console.log('After Change - obj: ', obj);           // 45 - This also changes
console.log('After Change - objclone: ', objclone); // 45