/**
 * 
 */
 
 var app ={
	 name:'ramesh',    //static
	 add:function(){
		console.log(this.name)    // static 
	 }
 }
 
 app.address ='chennai'   
 
 app.show = function(){
	 
	 
	 var contentPara = document.getElementById("content")
	 
	 contentPara.innerHTML='This page authored by 18 brilliant minds and '+this.name +'from'+this.address
 }
 
 app.showDetails = function(event){
	 			// event.preventDefault()
			 
			 console.log(event.target.setAttribute('href','#'))

 }
 app.attachEvents = function(){
	 
	 //var links = document.getElementsByTagName('a')
	 
	 var links = document.querySelectorAll("li>a")
	  
	 for(var i=0;i<links.length;i++){
		 
		 
		 links[i].addEventListener('mouseover',function(){
			 this.setAttribute('style',"font-size:1.2em")
		 })
		 
		 		 links[i].addEventListener('mouseout',function(){
			 this.setAttribute('style',"font-size:1.0em")
		 })

	 }
	 
	 
 }
 
 
 