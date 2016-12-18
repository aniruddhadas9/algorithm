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




function timeConversion(s) {
    // test1: - in-12:05:39AM  --out-00:05:39
    // test2: - in-04:59:59AM  --out-04:59:59
    let values = s.split(':');
    let hr = parseInt(values[0]);
    if(values[2].charAt(values[2].length-2) === 'P' && hr < 12 ) values[0] = hr+12;
    else if(values[2].charAt(values[2].length-2) === 'A' && hr === 12 ) values[0] = '00';
    values = values.join(':');
    return values.substring(0, values.length-2);
}

function main() {
    var s = readLine();
    var result = timeConversion(s);
    process.stdout.write("" + result + "\n");

}

main();