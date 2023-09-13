import React,{useState} from 'react'
import Link from './Link'

const Menu = ({links}) => {

  const [color,setColor]=useState('#00FF00')

   const handleOver = (event) => {

     setColor('#00AA00')
     event.preventDefault()

   }

    const createElement = (element,idx)=> {
      return (
        <Link
          element={element}
          idx={idx}
          key={idx}
          handleOver={handleOver}
          color={color}
        ></Link>
      );
    }
  return (
    <div>
        {
           links.map(createElement)
        }
    </div>
  )
}

export default Menu