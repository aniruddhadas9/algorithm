process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/*
 - understood the problem by asking all the question arises in mind
 - made all enquiries before writing the code
 - think loudly so that other person will know what is going on in your mind
 - make the plan what you are going to write
 - got the go ahead from the interviewer or else ask what he thinks about the plan
 - analyze the algorithn on Big O terms to measure time and space complexity
 - write the code --finally! :)
 - verify everything is is implemented and no scope of improvement
 - test the code properly
 - make sure everything implemented and there is no scope of improvement

*/
/////////////// ignore above this line ////////////////////

function commonChild(s1, s2){
    // Complete this function
    let dictiona
}

function main() {
    var s1 = readLine();
    var s2 = readLine();
    var result = commonChild(s1, s2);
    process.stdout.write("" + result + "\n");

}



/*


Given two strings  and  of equal length, what's the longest string () that can be constructed such that it is a child of both?

A string  is said to be a child of a string  if  can be formed by deleting 0 or more characters from .

For example, ABCD and ABDC has two children with maximum length 3, ABC and ABD. Note that we will not consider ABCD as a common child because C doesn't occur before D in the second string.

Input format

Two strings,  and , with a newline separating them.

Constraints

All characters are upper cased and lie between ASCII values 65-90.
Output format

Print the length of the longest string , such that  is a child of both  and .

Sample Input 0

HARRY
SALLY
Sample Output 0

2
The longest possible string that is possible by deleting zero or more characters from  and  is , whose length is 2.

Sample Input 1

AA
BB
Sample Output 1

0
 and  has no characters in common and hence the output is 0.

Sample Input 2

SHINCHAN
NOHARAAA
Sample Output 2

3

The longest string that can be formed between  and  while maintaining the order is .

Sample Input 3

ABCDEF
FBDAMN
Sample Output 3

2
BD is the longest child of the given strings.


 */