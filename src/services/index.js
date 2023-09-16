
import axios from "axios";

const url ='http://localhost:4000/deposits'


export const findAll =  ()=>{

     return  axios.get(url)
}

export const findById =  (id)=>{

    return  axios.get(url+"/"+id)
}
export const add =async (Deposit)=>{

    await axios.post(url,Deposit);
}

export const remove = async (id)=>{

    await axios.delete(url+'/'+id)
}

export const update = async (id,deposit)=>{

    await axios.put(url+'/'+id,deposit)
}




