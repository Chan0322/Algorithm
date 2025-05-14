const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(" ");

const n1 = Number(input[0]);
const n2 = Number(input[1]);

if(n1 > n2){
    console.log(">");
}else if(n1 < n2){
    console.log("<");
}else{
    console.log("==");
}