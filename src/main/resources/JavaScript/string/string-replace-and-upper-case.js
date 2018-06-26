/*
 Using the JavaScript language, have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.

 */

function LetterChanges(str) {

    var start = 'a'.charCodeAt(0);
    var end = 'z'.charCodeAt(0);
    str = str.replace(/[a-zA-Z]/g, function(i){
        i = (i.charCodeAt(0) == end)?String.fromCharCode(start):String.fromCharCode(i.charCodeAt(0)+1);
        if(['a', 'e', 'i', 'o', 'u'].includes(i)) i = i.toUpperCase();
        return i;
    });
    return str;

}

LetterChanges('this is the test including z which will converted to a');
