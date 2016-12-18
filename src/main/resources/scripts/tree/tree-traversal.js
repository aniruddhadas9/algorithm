/**
 * Hacker Rank
 */

/*
 Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

 Input Format

 The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

 Constraints

 Output Format

 Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

 Sample Input

 3
 11 2 4
 4 5 6
 10 8 -12
 Sample Output

 15
 Explanation

 The primary diagonal is:

 11
 5
 -12
 Sum across the primary diagonal: 11 + 5 - 12 = 4

 The secondary diagonal is:

 4
 5
 10
 Sum across the secondary diagonal: 4 + 5 + 10 = 19
 Difference: |4 - 19| = 15

 */



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

/////////////// ignore above this line ////////////////////

function diagonalDifference(a) {
    // Complete this function
    let start = 0;
    let end = 0;
    for (let i = 0; i < a.length; i++) {
        start += a[i][i];
        end += a[i][a.length - (i + 1)];
        // console.log('startValue:%o|start:%o|endValue:%o|end%o|', a[i][i], start, a[i][a.length - (i + 1)], end);
    }
    return Math.abs(end - start);
}

function main() {
    var n = parseInt(readLine());
    var a = [];
    for (a_i = 0; a_i < n; a_i++) {
        a[a_i] = readLine().split(' ');
        a[a_i] = a[a_i].map(Number);
    }
    var result = diagonalDifference(a);
    process.stdout.write("" + result + "\n");

}

var minput = [[-10, 3, 0, 5, -4], [2, -1, 0, 2, -8], [9, -2, -5, 6, 0], [9, -7, 4, 8, -2], [3, 7, 8, -5, 0]];
console.log('diagonalDifference: %o', diagonalDifference(minput));