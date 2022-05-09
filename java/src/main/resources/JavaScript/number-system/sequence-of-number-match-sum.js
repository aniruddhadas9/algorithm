/**
  Problem:
  Given a sequence of nonnegative integers A and an integer T, return whether there is a *continuous sequence* of A that sums up to exactly T

 Example:
 [23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20
 [1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8
 [1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds…

 */

function sequenceSum(a, sum) {
    for (var i = 0; i < a.length; i++) {
        for (var j = i + 1; j < a.length; j++) {
            if (a[i] + a[j] === sum) console.log('a[i]+a[j]===' + i);
            else if (a[i] + a[j] + a[j + 1] === sum) console.log('a[i]+a[j]+a[j+1]===' + i);
            else if (a[i] + a[j] + a[j + 1] + a[j + 2] === sum) console.log('a[i]+a[j]+a[j+1]+a[j+2]===' + i);
        }
    }
}

sequenceSum([1, 2, 3, 4, 5, 6, 7, 8, 9], 13);
