import React,{useState} from 'react'
import { addLoan } from '../api'
const AddLoan = () => {

    const [loan,setLoan]= useState({})
    const [message,setMessage]= useState('')

    const handleChange=(event) => {
        let name = event.target.name
        let value = event.target.value

        setLoan({...loan,[name]:value} )
    }
    const handleSubmit=async (event) => {

        event.preventDefault()
       await addLoan(loan)

             setMessage('Successfully Added loan')
    }

  return (
        <form onSubmit={handleSubmit}>
       {message}

<div>
    <label>Loan Id</label>
    <input type='text' name="id" onChange={handleChange}></input>
</div>

<div>
    <label>Applicant Name</label>
    <input type='text' name='applicantName' onChange={handleChange}></input>
</div>

<div>
    <label>Loan Amount</label>
    <input type='text' name="loanAmount" onChange={handleChange}></input>
</div>

<div>
         <button>Submit</button>
         </div>
        </form>
  )
}

export default AddLoan