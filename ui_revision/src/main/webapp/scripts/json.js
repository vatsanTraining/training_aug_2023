
/**
 * 
 */
 
 var myjson={}
 
 myjson.jsonToString=function(){
	 
	 // Objects can have functions  and keys are not quotated
	 var obj ={id:101,name:"ram",email:"ram@abc.com",func:function(){}}
	 
	 var json={"id":101,"name":"ram","email":"ram@abc.com"}
	 
	 console.log(typeof json)  //object
	 
	 var jsonToString =JSON.stringify(json)
	 
	 	 console.log(typeof jsonToString)   //string

 }
 
 myjson.stringToJson=function(){
	 
	 var string = '{"id":101,"firstName":"suresh","email":"sur@abc.com"}'
	 
	 console.log(typeof string)
	 
	 var stringToJson = JSON.parse(string)
	 
	 	 console.log(typeof stringToJson)
	 	 
	 	 console.log(stringToJson.firstName )
	 	 console.log(stringToJson.email)

 }
 
 myjson.display =function(element,idx){
			 
			 console.log(idx)
			 console.log(element.name)
		 }
		 
 myjson.iterate =function(){
	 	 var jsonList=[
		 {"id":101,"name":"ram","email":"ram@abc.com"},
	 	 {"id":102,"name":"bikash","email":"bika@abc.com"},
	 	 {"id":103,"name":"jaya","email":"jay@abc.com"}
	 	 ]

         jsonList.map(myjson.display)
	 
 }
 
 //myjson.jsonToString()
 //myjson.stringToJson()
 myjson.iterate();