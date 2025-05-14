const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim();

const result = Number(input);

if(90<=result && result<=100){
    console.log("A");
}else if(80<=result && result<90){
    console.log("B");
}else if(70<=result && result<80){
    console.log("C");
}else if(60<=result && result<70){
    console.log("D");
}else{
    console.log("F");
}