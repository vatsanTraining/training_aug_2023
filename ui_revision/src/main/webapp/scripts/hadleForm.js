/**
 * 
 */
 
 var app={}
 
 app.attachEvent =function(){
	 
	 var passWordFld =document.getElementById('password')
	 
	 	 var btn =document.getElementById('loginBtn')

	 passWordFld.addEventListener('blur',function(){

	 
	 var password = this.value

     var passwordLength = password.length;
     
   if(passwordLength >3 && passwordLength<8)		 
		      
		      btn.disabled=false
		       

	 })
 }