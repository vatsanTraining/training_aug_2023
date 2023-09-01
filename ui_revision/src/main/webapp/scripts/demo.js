/**
 * 
 */
 
 
 var demo ={}
 
 demo.addPincode=function(){

 var pincode =document.getElementById("pincode")
 
 console.log(pincode)	 
 
  pincode.innerHTML='500201'

 }
 
 demo.attachClickEvent = function(){
	 
	 var button =document.getElementById("likeBtn")
 

var count = 1 
  button.addEventListener('click',function(){

	  	 var countFld =document.getElementById("count")
	  	 
	  	  countFld.innerHTML=count
           count++
  })
 
 }
 
 