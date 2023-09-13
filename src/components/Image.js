import React from 'react'

const Image = ({bankLogo,altText}) => {
   return  <img src={bankLogo} alt={altText} className='logo'></img>

}

export default Image