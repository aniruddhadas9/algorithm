/**
 * This function is quite important as it have number of complication.
 * 1. typeof NaN === 'number'
 * 2. in java script float, number and NaN are consider as number and there are no physical difference between
 *    integer, float in javascript
 * 3. NaN type is also a number
 *
 *
 * So this function is complecated in javascript and can be implemented in number of ways.
 *
 */

/**
 * @name isIntegerByTypeof
 * @desc Check a input is integer or not by using typeof operator in javascript
 *
 *
 * @returns {boolean}
 */
function isIntegerByTypeof(input) {
    if (typeof input === 'number') {
        if ('' + input === 'NaN') return false;
        if (('' + input).split('').indexOf('.') >= 0) return false;
        return true;
    }
    return false;
    // TODO: fails on large integer value
}

/**
 * @name isIntegerBySift
 * @desc Check a input is integer or not by using sift(^) operator in javascript
 *
 * @param x
 * @returns {boolean}
 */
function isIntegerBySift(x) {
    return (x ^ 0) === x;
}


// Note: both fails in large number value input as it convers to something 23.44e363 with have a coma and doube I think.

function isInteger(x) {
    return Math.round(x) === x;
}

function isInteger(x) { return (typeof x === 'number') && (x % 1 === 0); }


//!WRONG solution
function isInteger(x) { return parseInt(x, 10) === x; }


// after es6
Number.isInteger(123);