/*Question 1
let arr=[1,2,3,4,5,6,2,3];
let num=2;
let i=0;
while(i<arr.length){
    if(arr[i]==num){
        arr.splice(i,1);
    }
    else{
        i++;
    }
}
console.log(arr);
*/
/*Q2.
let number=287152
let str=number.toString();
console.log(str.length);*/

/*Q3.
let number=287152
let copy=number;
let sum=0;
while(copy>0){
 let d=copy%10;
 sum+=d;
 copy=Math.floor(copy/10);
}
console.log(sum);*/
/*Q4.
let number=7
let fact=1;
for(let i=1;i<=number;i++){
    fact*=i;
}
console.log(fact);*/
/*Q5.*/
let arr=[3,6,2,7,4,5,1];
let max=Number.MIN_VALUE;
for(let i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
console.log(max);


