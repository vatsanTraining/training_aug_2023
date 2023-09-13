import React from 'react'
import Menu from './Menu'
import bankLogo from '../images/bank_logo.png'
import Image from './Image'
const Header = ({majHeading,minorHeading,links}) => {

  return (
    <div>
        <Image bankLogo={bankLogo} altText={'banklogo'}></Image>

        <h1 className='App'>{majHeading}</h1>
        <h4 className='App'>{minorHeading}</h4>
        <Menu links={links}></Menu>

    </div>
  )
  
}

export default Header