
// a:\aabc\bddd\..\c\..\d\.\a.txt      a:\a\d\a.txt

//http://collabedit.com/7au7u

['a:', 'aabc', 'd', 'a.txt']
a:/aabc/d/a.txt

function absPath(relPath) { // a:\a\b\..\c\..\d\.\a.txt

    // relPath  = relPath.split('\\');

    relPath.forEach((v, i)=> {
        if(val === '..') {
            // relPAth.splice(i-1, 2);
        }
        if (val=== '.') {
            //    relPAth.splice(i, 1);
        }
    });
}
///return relPath.join('\');
}

// ["aaaa", ":", "a", "", ".", ".", "c", ".", ".", "d", ".", "a", ".", "t", "x", "t", " "]
// \a\c\..\d\.\a.txt
// \a\c\..\d\.\a.txt