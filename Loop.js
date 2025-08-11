let favourite ="Barbie";
let guess=prompt("Guess your my favourite movie");
while(guess!=favourite && guess!="quit"){
    guess=prompt("Try Again");
}
if(guess==favourite){
console.log("You Win");
}
else{
    console.log("Game Over");
}
