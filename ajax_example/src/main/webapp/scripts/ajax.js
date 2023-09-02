/**
 * 
 */
 
 var app={}
 		  var xhr = new XMLHttpRequest()

 app.attachEvent=function(){
	 
	 var userNameFld = document.getElementById('userName');
	 
	  userNameFld.addEventListener('blur',function(){
		  
		  var userName = userNameFld.value
		  
		 // var url ="http://localhost:8080/ajax_example/LoginServlet"+"?userName="+userName
		  var url ="http://jsonplaceholder.typicode.com/users"
		    xhr.onreadystatechange=app.processRequest
		  
		  xhr.open('GET',url,true)
		  
		  xhr.send(null)
		  
	  });

	 

 }
 
 app.processRequest = function(){
	 
	 if(xhr.readyState==4 && xhr.status ==200)
	 {
		 var result = xhr.responseText
		 
		 	 var message = document.getElementById('content')
		 	 
		 	  var resp =JSON.parse(result)
		 	  
		 	  
		 	 message.innerHTML=resp[0].username

	 }
 }