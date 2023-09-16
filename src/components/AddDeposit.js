import React,{useState} from 'react'
import {add} from '../services/'
import { useNavigate } from 'react-router-dom'
const AddDeposit = () => {

   const navigate = useNavigate();

   const [deposit,setDeposit] = useState({})

  const handleChange = (e) => {

    setDeposit({...deposit,[e.target.name]:e.target.value})
  }

  const handleSubmit= (event) => {
    
     event.preventDefault()
       add(deposit)
       navigate('/')
  }

  return (
    
    <form onSubmit={handleSubmit}>

         <div>
          <label>Id</label>
          <input type='text' name='id' onChange={handleChange}></input>
         </div>

         <div>
          <label>Details</label>
          <input type='text' name='tenure' onChange={handleChange}></input>
         </div>

         <div>
          <label>Rate of Interest</label>
          <input type='text' name='rateOfInterest' onChange={handleChange}></input>
         </div>

         <div>
          <button>Submit</button>
         </div>


    </form>
  )
}

export default AddDeposit