# splice

The splice() method changes the contents of an array by removing existing elements and/or adding new elements.
And returns removed element array. If no element removed, it returns empty [] array.

```javascript
Array.prototype.splice(start[, deleteCount[, item1[, item2[, ...]]]])
```
little simplified.

```javascript
Array.prototype.splice(startIndex, NumberIntemDelete?, AddItem1?, AddItem2?, AddItem3?, ...)
```
And only the first parameter is required. even if you will not pass any parameter, it will not throws any error but does nothing.



### Parameters
##### start
Index at which to start changing the array (with origin 0). If greater than the length of the array, actual starting index will be set to the length of the array. If negative, will begin that many elements from the end of the array (with origin -1) and will be set to 0 if absolute value is greater than the length of the array.

##### deleteCount (Optional)

An integer indicating the number of old array elements to remove.
 - If deleteCount is omitted, or if its value is larger than array.length - start (that is, if it is greater than the number of elements left in the array, starting at start), then all of the elements from start through the end of the array will be deleted.
 - If deleteCount is 0 or negative, no elements are removed. In this case, you should specify at least one new element (see below).

##### item1, item2, ... (Optional)

The elements to add to the array, beginning at the start index. If you don't specify any elements, splice() will only remove elements from the array.

##### Return value
An array containing the deleted elements. If only one element is removed, an array of one element is returned. If no elements are removed, an empty array is returned.

## Description
If you specify a different number of elements to insert than the number you're removing, the array will have a different length at the end of the call.



#### Examples

```javascript
var myFish = ['angel', 'clown', 'mandarin', 'sturgeon'];


myFish.splice(2, 0, 'drum'); // insert 'drum' at 2-index position
// myFish is ["angel", "clown", "drum", "mandarin", "sturgeon"]


myFish.splice(2, 1); // remove 1 item at 2-index position (that is, "drum")
// myFish is ["angel", "clown", "mandarin", "sturgeon"]



Remove 0 elements from index 2, and insert "drum"
var myFish = ['angel', 'clown', 'mandarin', 'sturgeon'];
var removed = myFish.splice(2, 0, 'drum');

// myFish is ["angel", "clown", "drum", "mandarin", "sturgeon"] 
// removed is [], no elements removed
Remove 1 element from index 3
var myFish = ['angel', 'clown', 'drum', 'mandarin', 'sturgeon'];
var removed = myFish.splice(3, 1);

// removed is ["mandarin"]
// myFish is ["angel", "clown", "drum", "sturgeon"]
Remove 1 element from index 2, and insert "trumpet"
var myFish = ['angel', 'clown', 'drum', 'sturgeon'];
var removed = myFish.splice(2, 1, 'trumpet');

// myFish is ["angel", "clown", "trumpet", "sturgeon"]
// removed is ["drum"]
Remove 2 elements from index 0, and insert "parrot", "anemone" and "blue"
var myFish = ['angel', 'clown', 'trumpet', 'sturgeon'];
var removed = myFish.splice(0, 2, 'parrot', 'anemone', 'blue');

// myFish is ["parrot", "anemone", "blue", "trumpet", "sturgeon"] 
// removed is ["angel", "clown"]
Remove 2 elements from index 2
var myFish = ['parrot', 'anemone', 'blue', 'trumpet', 'sturgeon'];
var removed = myFish.splice(myFish.length - 3, 2);

// myFish is ["parrot", "anemone", "sturgeon"] 
// removed is ["blue", "trumpet"]
Remove 1 element from index -2
var myFish = ['angel', 'clown', 'mandarin', 'sturgeon'];
var removed = myFish.splice(-2, 1);

// myFish is ["angel", "clown", "sturgeon"] 
// removed is ["mandarin"]
Remove all elements after index 2 (incl.)
var myFish = ['angel', 'clown', 'mandarin', 'sturgeon'];
var removed = myFish.splice(2);

// myFish is ["angel", "clown"] 
// removed is ["mandarin", "sturgeon"]
```