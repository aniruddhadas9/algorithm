/**
 * What is the Time complexity of the below program
 *
 * @param str
 * @returns {boolean}
 */
function isPalindrome(str) {
    str = str.replace(/\W/g, '').toLowerCase();
    return (str == str.split('').reverse().join(''));
}
