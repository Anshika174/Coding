let id=setInterval(()=>{
    console.log("Hello Wolrd!")
},2000);
setTimeout(()=>{
    clearInterval(id);
    console.log("Clear interval ran");
},10000);
setTimeout();


