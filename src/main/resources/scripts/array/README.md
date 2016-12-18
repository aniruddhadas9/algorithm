# Array

JavaScript array is a data type which holds elements and assign a index to him. The element can be any data type like number, string, array, object function etc.



## insert element to array

##### start of the array (unshift)
unsift is the function which is used to add an item at the start of the array. So you will get the item at index `0`.

```javascript
var newLength = fruits.unshift('Strawberry') // add to the front
```

##### end of the array (push)
push a item will push the item at the end of the array. so you will get the itema at `array.length-1` position

```javascript
var newLength = fruits.push('Strawberry') // add to the front
```

##### any position of the array (splice)

The splice() method changes the contents of an array by removing existing elements and/or adding new elements.

`array.splice(start[, deleteCount[, item1[, item2[, ...]]]])`

Example

```javascript
var arr = [];
arr[0] = "Jani";
arr[1] = "Hege";
arr[2] = "Stale";
arr[3] = "Kai Jim";
arr[4] = "Borge";

console.log(arr.join()); // Jani,Hege,Stale,Kai Jim,Borge
arr.splice(2, 0, "Lene");
console.log(arr.join()); // Jani,Hege,Lene,Stale,Kai Jim,Borge

```




## Remove element to array

##### start(shift)

```javascript
var first = fruits.shift(); // remove Apple from the front
```

##### end(pop)

```javascript
var last = fruits.pop(); // remove Orange (from the end)
```

##### any position (splice)


```javascript
var removedItem = fruits.splice(pos, 1); // this is how to remove an item
```


