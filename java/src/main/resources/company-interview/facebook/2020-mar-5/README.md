# problem 1
Create a function where you will be able to kill all setTimeout() created anywhere in the function.

#### Learnings

- think first and propose the solution
- Try to read the mind for interviewer what he actually want
- Analyze the problem your self and ask questions as required nicely and make the interviewer understand your question
- 

# problem 2
Roman calculation where each character have a numerical value. the actual string value need to be calculated

#### Learnings

- think first
- Analyze the problem your self and ask questions as required nicely and make the interviewer understand your question
- Do not ask question because you have to ask questions
- 

```javascript

var value = 'MCMXLVIII';
var map = {'M':1000, 'D':500, 'C':100, 'L':50, 'X':10, 'V':5, 'I':1};

// Single character
// M = 1000
// C = 100

// Normal
// MM = 2000 = 1000 + 1000
// MC = 1100 = 1000 + 100

// CCC = 100 + 100 + 100

// Special cases
// CM = 900 = 1000 - 100 because 100 < 1000
// MCM = 1900 = 1000 + (1000 - 900)

// 1000 + (1000 - 100) + (50 - 10) + 5 + 1 + 1 + 1
// MCMXLVIII - 1000 + 100 + 1000 + 

// 1000 - 100 + 1000 - 10 + 50 + 5 + 1 + 1 + 1
// M      C     M      X    L    V   I   I   I

// O(n)

function(input) {
  result = 0;
  inputs = input.split();
  
  for(let i=0; i< inputs.length; i++) {
       if (inputs[i] < inputs[i+1]) {
         result += inputs[i+1] - inputs[i] ;
         i++;
       } else {
         result += inputs[i];
       }
    }
  
  return result;
}

```

