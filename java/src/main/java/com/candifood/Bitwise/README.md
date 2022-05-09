# Bitwise

Bitwise operators treat their operands as a sequence of 32 bits (zeroes and ones), rather than as decimal, hexadecimal, or octal numbers. For example, the decimal number nine has a binary representation of 1001. Bitwise operators perform their operations on such binary representations, but they return standard JavaScript numerical values.

Like below code shows how 5 &#65120; 13 will be 5. README is unable to show &#65120; in the code so consider its a single &#65120; not the &#65120;&#65120; ampersand.


```javascript
console.log(5 & 13); // 0101 & 1101 = 0101
// expected output: 5;

console.log(parseInt("0101",2) & parseInt("1101",2));
// expected output: 5;

console.log(5 & 13 & 3); // 0101 & 1101 & 0011 = 0001
// expected output: 1;

console.log(5 | 13); // 0101 | 1101 = 1101
// expected output: 13
```

interesting right?

let me write binary number system and tell you how 0101 is 5. So in a 4 bit (means 4 charactor starters with 0000 and ends with 1111) below are the number system.

```
0000 - 0
0001 - 1
0010 - 2
0011 - 3
```
Here if you will the 2 digit (starts with 00 and ends with 11) have 4 combination and represents 4 numbers from 0 to 3.
similarly in 4 bit (from 0000 to 1111) we can represt whole number sent in computer science.

```
0000 - 0
0001 - 1
0010 - 2
0011 - 3
0100 - 4
0101 - 5 --> Now you got how 5 is represented in 4 bit bunary muber system ;) and if it would be 8 bit or 32 bit or 64 bit, you will see preceding 0 before the number. thats it.
0110 - 6
0111 - 7
1000 - 8
1001 - 9
1010 - 10
1011 - 11
1100 - 12
1101 - 12 --> now you got 13
```

I hope you got the whole binary number system :) 
Some other day, may be I will demonstrate converting from one number system to another

Now lets proceed with our study in 

```
Operator	Usage	Description
Bitwise AND	a & b	Returns a 1 in each bit position for which the corresponding bits of both operands are 1's.
Bitwise OR	a | b	Returns a 1 in each bit position for which the corresponding bits of either or both operands are 1's.
Bitwise XOR	a ^ b	Returns a 1 in each bit position for which the corresponding bits of either but not both operands are 1's.
Bitwise NOT	~ a	Inverts the bits of its operand.
Left shift	a << b	Shifts a in binary representation b (< 32) bits to the left, shifting in 0's from the right.
Sign-propagating right shift	a >> b	Shifts a in binary representation b (< 32) bits to the right, discarding bits shifted off.
Zero-fill right shift	a >>> b	Shifts a in binary representation b (< 32) bits to the right, discarding bits shifted off, and shifting in 0's from the left.
```