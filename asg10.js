let form = document.querySelector("form");
let input = document.querySelector("input");

// 1. mouseout
form.addEventListener("mouseout", function () {
  console.log("Mouse moved out of form");
});

// 2. keypress
input.addEventListener("keypress", function (event) {
  console.log("Key pressed:", event.key);
});

// 3. scroll
window.addEventListener("scroll", function () {
  console.log("Page is being scrolled");
});

// 4. load
window.addEventListener("load", function () {
  console.log("Page fully loaded");
});
let btn=document.createElement("button");
btn.innerText="Click Me!!";
document.querySelector("body").append(btn);
btn.addEventListener("click",function(){
    btn.style.backgroundColor="green";
    console.log("Button is Clicked and color is changed");
});