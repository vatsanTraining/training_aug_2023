import React from 'react'

const Button = ({handleClick,count}) => {
  return (
    <div>
    <button onClick={handleClick}>😍</button> <span style={{margin:"10px"}}>{count}</span>
    </div>
  )
}

export default Button