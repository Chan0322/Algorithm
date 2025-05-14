const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

let arr1 = input[0].split('');
let arr2 = input[1].split('');

let n1 = Number(input[0]) * Number(arr2[2]);
let n2 = Number(input[0]) * Number(arr2[1]);
let n3 = Number(input[0]) * Number(arr2[0]);

console.log(n1);
console.log(n2);
console.log(n3);
console.log((n3*100) + (n2 * 10) + n1);