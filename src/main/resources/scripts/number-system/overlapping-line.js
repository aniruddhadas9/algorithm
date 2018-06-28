
/*
I have written this but think this is not the solution.

 */
function calculate(firstPoint, firstLength, secondPoint, secoundLngth) {
    let firstLine = firstPint + firstLength; // 6, 11 17
    let secondLine = secondPint + secondLength; // 9, 10 19
    let overLapStart;
    let end;

    if (firstPoint > socndPoint || firstPoint < secondPont + secondLength) {
        overLapStart = secoundPoint;
        end = secondPont + secondLength
    }

    if (secondPoint > firstPoint || secoundPoint < firstPont + firstLength) {
        overLapStart = secondPoint;
        end = firstPont + firstLength
    }
}