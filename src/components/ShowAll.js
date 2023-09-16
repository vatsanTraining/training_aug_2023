import React, { useEffect, useState } from 'react';
import { getallLoans,deleteLoan } from '../api';
import { Link } from 'react-router-dom';


const ShowAll = () => {


    const [loanList,setLoanList] =useState([])

    const fetchData =async () => {

        const response =await getallLoans();

        setLoanList(response.data)
         console.log(response.data)
      }
    
    useEffect(() => {
        fetchData();
    }, [])

    const createElement  = (ele,idx) => {

     return    <tr key={idx}>
            <td>{ele.id}</td>
            <td>{ele.applicantName}</td>
            <td>{ele.loanAmount}</td> 
            <td><Link to={`/edit/${ele.id}`}>Edit</Link></td>
            <td> <button  onClick={() => deleteItem(ele.id)}>Delete</button></td>
    
            </tr>
       }
    
    

    const deleteItem = async (id) => {
        await deleteLoan(id);
        fetchData();
    }

    return (
        <table>
            <thead>

            <tr>
             <th>id</th>
            <th>Applicant Name</th>
            <th>Loan Amount</th>
            </tr>
            </thead>
            <tbody>
                {
                    loanList.map(createElement)
                }
            </tbody>
        </table>
    )
}

export default ShowAll;