var weight = prompt("Enter an weight");
var height = prompt("Enter an height in cm");
var bmi =( weight /(height*height))*10000;
eval(bmi);
if(bmi<=18.4){
console.log("UnderWeight");
}else if(bmi>=18.5 && bmi <=24.9){
console.log("Normal");
}
else if(bmi>=25 && bmi<=39.9){
console.log("OverWeight");
}
else{
console.log("Obese");
}