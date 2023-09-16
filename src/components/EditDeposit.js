import React,{useEffect,useState} from 'react'
import { useParams,useNavigate } from 'react-router-dom'
import {findById,update} from '../services'

const EditDeposit = () => {

  const navigate = useNavigate()

    const {key} =useParams()

  const [deposit,setDeposit] =useState({})
    
     const loadDeposit =  async(key) =>{
      const response =  await findById(key);
      
      setDeposit(response.data)
      console.log(response.data)
  }

  useEffect(() => {
    loadDeposit(key)
 },[key]);

 const handleSubmit = () => {
  update(key,deposit);
       navigate('/')
 }
 const handleChange =(event) =>{

  const {name,value} = event.target
  setDeposit({...deposit,[name]:value})
 }

  return (
    <>
    <div>
     <label>Tenure</label>
     <input type='text' name='tenure' defaultValue={deposit.tenure} onChange={handleChange}></input>
    </div>
        <div>
        <label>Rate of Interest</label>
        <input type='text' name='rateOfInterest' defaultValue={deposit.rateOfInterest} onChange={handleChange}></input>
       </div>
       <div>
        <button onClick={handleSubmit}>Edit</button>
       </div>
       </>
  )
}

export default EditDeposit