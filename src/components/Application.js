import React from 'react'
import ShowDeposit from './ShowDeposit'
import {Routes,Route} from 'react-router-dom'
import NavBar from './NavBar'
import AddDeposit from './AddDeposit'
import EditDeposit from './EditDeposit'
const Application = () => {
  return (
    <div>
        <NavBar></NavBar>
        <Routes>
            <Route path='/' element={<ShowDeposit/>}></Route>
            <Route path='/add' element={<AddDeposit/>}></Route>
            <Route path='/edit/:key' element={<EditDeposit/>}></Route>

        </Routes>
    </div>
  )
}

export default Application