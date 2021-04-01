// How do you find the largest and smallest number in an unsorted integer array?

Math.max(...arry)
Math.min(...arry)

// array = [2, 5, 8, 7, 6];

function test(array) {
    if (array && array.length > 1) {
        let max = array[0];
        let min = array[0];
        for (let i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
    }
}
