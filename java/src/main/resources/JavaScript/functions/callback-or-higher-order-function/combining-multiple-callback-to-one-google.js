/**
 * Asked in google interview
 * This question is about creating callback function or higher ordfer function
 * you can start with: https://www.sitepoint.com/higher-order-functions-javascript/
 * this is in detail and recommended [important]: https://eloquentjavascript.net/05_higher_order.html
 * @param prefix
 * @param fun
 * @returns {*}
 */

// this is the structure which will be used as input array member for allCallback or super function
function sample(prefix, fun){
    // console.log('simple called %o, ', prefix);
    return fun();
}

function allCallback(allFun) {

    return function (prefix, funm) {
        let returnValue = [];
        allFun.forEach(function(fun) {
            returnValue =[ ...returnValue, ...fun()];
            // console.log('fun:%o | returnValue:%o', fun, returnValue);
        });

        funm(returnValue);
    }
}

maincall = allCallback([
    function(){ return ['aaple', 'aama'];},
    function(){ return ['abman', 'abwomen'];},
    function(){ return ['acount', 'accurate'];},
    function(){ return ['adidas', 'adas'];}
    ]);


maincall('aa', function(result){
    console.log('final result: %o', result);
});




/* another example*/
function man(outer) {
    return function(inner, fun){
        return fun.call(this, outer+inner);
    }
}
var manner = man(15);
manner(20, function (res){console.log('>>>>'+res+'<<<<<')})


