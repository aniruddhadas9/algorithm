function LetterCapitalize(str) {

    // code goes here
    var arrayStr = str.split(' ');
    arrayStr = arrayStr.map(function(val) {
        return val.replace(val.charAt(0), val.charAt(0).toUpperCase());
    });
    str = arrayStr.join(' ');
    return str;

}

// keep this function call here
LetterCapitalize(readline());