/**
 * 
 */
 
 var app={}
 
 app.parseToString=function(json){
	

	var jsonToString = JSON.stringify(json)

	console.log(jsonToString)

	console.log(jsonToString.toUpperCase())

	console.log(jsonToString.length)
	
	console.log(typeof jsonToString)

}

app.arrayOfJson = function(json){
	
	json.map((ele,idx)=>{
		console.log(ele.name)
		console.log(idx)
	})
}

app.toJson =function(string){
	
	var stringTojson = JSON.parse(string)

	console.log(stringTojson.firstName)

	console.log(stringTojson.mark)

}

app.plainStringToJson=function(){
	
	var string ="id:101,name:rohanKumar,salary:6000"
	
	const temp = string.split(",");
			const obj = {}
			let i = 0;
			while (i < temp.length) {
				var eachEle =temp[i]
				var ele = eachEle.split(":")
			    obj[ele[0]]=ele[1]
				 i++
			  			}

			console.log(obj)
			console.log(obj.name)

}
		

	app.parseToString({name:"ram",mark:90})

	app.toJson('{"firstName":"ram", "mark":90, "city":"Chennai"}')
	
	app.arrayOfJson([{name:"lalith",mark:90},{name:"lakshya",mark:80}])
	
	app.plainStringToJson()

