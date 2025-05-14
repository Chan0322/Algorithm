const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(" ");

const n1 = Number(input[0]);
const n2 = Number(input[1]);
const n3 = Number(input[2]);

console.log(n1+n2+n3);