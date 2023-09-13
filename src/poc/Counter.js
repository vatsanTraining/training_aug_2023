import React,{useState} from 'react'

const Counter = () => {

    const[count,setCount] =useState(1);
    const[text,setText] =useState('');

    const handleClick = (event) => {

        setCount(prevCount => prevCount +1)
    }

    const handleChange = (event) => {
        const val = event.target.value;
        setText(val)

    }
  return (
    <div>
        <p>Claps:{count}</p>
        <button onClick={handleClick}>👏</button>

        <p>{text}</p>
        <label>Enter the Text</label>
        <input type='name' onChange={handleChange}></input>
    </div>
  )
}

export default Counter