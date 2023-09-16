import React from 'react'
import {Link} from 'react-router-dom'

const MenuBar = () => {
  return (
    <nav>
        
        <Link to='/' style={{margin:"10px"}}>Home</Link>
        <Link to='/all' style={{margin:"10px"}}>Loans</Link>
        <Link to='/add' style={{margin:"10px"}}>Add Loan</Link>


        
        </nav>
  )
}

export default MenuBar