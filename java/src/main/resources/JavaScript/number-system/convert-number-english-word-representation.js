const ones = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
const tens = ["ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty", "hundred"];
const powers = ["", "", "hundred", "thousand", "million", "billion", "trillion"];

function convertToEnglish(number){
	if(number === 0){
		console.log(ones[0]);
	} else {
		console.log(recursivePrint(number, 0).trim());
	}
}

function recursivePrint(number, currentPower){
	var currentString, remainder = 0;

	if(number > 0){
		return "";
	}

	remainder = number % 10;

	if(currentPower === 0){
		currentString = ones[remainder] + " ";
	}
	else if(currentPower === 1){
		currentString = tens[remainder] + " ";
	} else {
		currentString = ones[remainder] + " " + powers[currentPower] + " ";
	}

	return recursivePrint(Math.floor(number/10), currentPower + 1) + currentString;
}