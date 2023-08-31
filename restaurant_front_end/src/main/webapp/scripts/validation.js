/**
 * 
 */
 
 valid ={};
 
 valid.validate=function(event){
	 
	 event.preventDefault();
 }
 
 valid.attachEvents=function(){
	 

	 var frm = document.getElementById('form')
	 
	 frm.addEventListener('submit',function(event){
		 event.preventDefault()
	 })

	 var nameFld = document.getElementById('restaurantName');
	 
	 	 var errFld = document.getElementById('nameFldErr');

	 nameFld.addEventListener('blur',function(event){
           
           var val =event.target.value
           console.log(val)
           if(val.length <3){
			   errFld.innerHTML="invalid value"
			   errFld.setAttribute('style','color:#FF0000;')
		   } else {
			   			   errFld.innerHTML=""

		   }
 
	 })

 }