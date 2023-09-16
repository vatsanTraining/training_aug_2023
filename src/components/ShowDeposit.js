import React,{useState,useEffect} from 'react'
import { findAll ,remove} from '../services'
import { Link } from 'react-router-dom'
const ShowDeposit = () => {

   const [depositList , setDepositList] =useState([{}])

    useEffect(()=>{
        fetchDeposit()
    
    },[])

   const  fetchDeposit = async ()=>{
      const  response =  await  findAll()
        setDepositList(response.data)
    }

    const deleteItem=  (id) =>{
         remove(id)
        fetchDeposit();
    }

    const createRow = (element,idx) => {

        return <tr key={idx}>
            <td>{element.tenure}</td>
            <td>{element.rateOfInterest}</td>
            
            <td><Link to={`/edit/${element.id}`}>Edit</Link></td>

            <td> <button  onClick={() => deleteItem(element.id)}>Delete</button></td>            
            </tr>
    }

  return (
    <>
      <table>
        <thead>
            <tr>
                <th>Deposit Tenure </th>
                <th>Rate of Interest</th>
            </tr>
        </thead>
        <tbody>
            {
                depositList.map(createRow)
            }
        </tbody>
      </table>

    </>
  )
}

export default ShowDeposit