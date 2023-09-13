import React,{useEffect,useState} from 'react'
import Blog from './Blog'
import axios from 'axios'

const Content = () => {

  const [loanList,setLoanList] =useState([])

  const fetchData =async () => {

    let response = await axios.get('http://localhost:4000/loans')

    console.log(response.data)
    setLoanList(response.data)
  }


  useEffect(() =>{
    fetchData()
  },[])

  const createElement=(ele,idx) =>{return <li key={idx}>{ele.applicantName}</li>}

  return (
    <div>
         <ul>
         {
          loanList.map(createElement)
         }
         </ul>
        <Blog></Blog>
    </div>
  )
}

export default Content