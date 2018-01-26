function sample(prefix, fun){
    return 1;
}

function allCallback(allFun) {
    console.log('allfun:%o', typeof allFun);
    return function (prefix, funm) {
        let returnValue = [];
        allFun.forEach(function(fun) {
            console.log('prefix:%o|funm:%o', prefix, funm);
            // console.log('---:fun:%o', typeof fun);
            returnValue.cancat(fun(prefix, funm));
        });
        return returnValue;
    }
}

maincall = allCallback([
    new sample('aa', function(){ console.log('11');}),
    new sample('ab', function(){ console.log('11');}),
    new sample('ac', function(){ console.log('11');}),
    new sample('ad', function(){ console.log('11');})
    ]);


maincall('aa', function(result){
    console.log('final result: %o', result);
});

