// Write a function that reverses the order of words in a sentence without using the built-in reverse() method. 
// Program:->

var newString = ""; 
var theString = prompt("Enter a Phrase that you would like to reverse (Ex. Hello world)"); 
 
var word = ""; 
var c; 
var stack = []; 
for (var i = 0, len = theString.length; i < len; i++) { 
  c = theString[i]; 
  word += c; 
 
  if (c == " " || i == (len-1)) { 
      word = word.trim(); 
      stack.push(word); 
      word = ""; 
  }   
} 
 
while (s = stack.pop()) {     
    newString += s + " "; 
} 
 
console.log(newString); 
