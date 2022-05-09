export class FibonacciByRecursive {

    public fibonacciCalculation(input) {
        if (input < 0) throw new Exception("Fibonacci does not work on negative numbers");
        if (input < 2) return input;
        if (input == 1) return 1;
        else return fibonacciCalculation(input - 1) + fibonacciCalculation(input - 2);
    }

    public fibonacci(number) {
        // result variable to hold the result
        const result = new int[number + 1];

        // looping until the input number and getting the fibonacci of each value
        while (number >= 0) {
            result[number] = fibonacciCalculation(number);
            number--;
        }

        // return the result
        return result;
    }

}


fibonacciByRecursive = new FibonacciByRecursive();
Arrays.stream(fibonacciByRecursive.fibonacci(3)).forEach(value => System.out.println(value));


