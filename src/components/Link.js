import React from 'react'

const Link = ({element,idx,handleOver,color}) => {

  return <a href={element.linkTo} key={idx}
       style={{margin:'10px' ,backgroundColor:color}} 
             onMouseOver={handleOver}>{element.linkText}</a>

}

export default Link