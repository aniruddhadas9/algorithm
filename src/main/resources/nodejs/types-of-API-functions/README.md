# blocking and npn blocking API function in NodeJs

There are two types of functions in Node.js.:

Blocking functions - In a blocking operation, all other code is blocked from executing until an I/O event that is being waited on occurs.
Blocking functions execute synchronously
For example:

```javascript
const fs = require('fs');
const data = fs.readFileSync('/file.md'); // blocks here until file is read
console.log(data);
// moreWork(); will run after console.log

```

The second line of code blocks the execution of additional JavaScript until the entire file is read. 
moreWork () will only be called after Console.log

Non-blocking functions - In a non-blocking operation, multiple I/O calls can be performed without the execution of the program being halted.
Non-blocking functions execute asynchronously. 

For example:

```javascript
const fs = require('fs');
fs.readFile('/file.md', (err, data) => {
  if (err) throw err;
  console.log(data);
});
// moreWork(); will run before console.log

```

Since fs.readFile () is non-blocking, moreWork () does not have to wait for the file read to complete before being called. This allows for higher throughput. 