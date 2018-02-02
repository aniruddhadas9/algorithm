function reverseString(str) {
    return str.split('').reverse().join('');
}


for(var i=0;i<9;i++) {
    for(var j=i+1;j<i;j++) {
        if(a[i]+a[j]===3) console.log('found3');
        else if(a[i]+a[j]+a[j+1]===3) console.log('found3');
        else if(a[i]+a[j]+a[j+1]+a[j+2]===3) console.log('found3');
    }
}