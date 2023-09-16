import React,{useEffect,useState} from 'react'
import { editLoan,getallLoans } from '../api';
import { useParams} from 'react-router-dom';

const EditLoan = () => {

  const [loan, setLoan] = useState({});

  const {id, applicantName, loanAmount} = loan;

    const { key } = useParams();

    useEffect(() => {
      loadLoan()
   });

    const handleChange=(event) => {
      const { name, value } = event.target

      console.log(name)
      console.log(value)

    setLoan(prevState =>({ ...prevState, [name]: value}));
            console.log(loan)
    }

           useEffect(() => {
            setLoan(loan)
           },[loan])
    
    const editLoanDetails=  (event) => {
        event.preventDefault();
       console.log(loan)

         editLoan(key,loan);
    }
    const loadLoan = async () =>{
        const response = await getallLoans(key);
        setLoan(response.data);
    }



  return (
<>
<div>
 <label>Loan Id</label>
 <input type='text' name="id" onChange={handleChange} defaultValue={id || ''}></input>
</div>

<div>
 <label>Applicant Name</label>
 <input type='text' name='applicantName' onChange={handleChange}  defaultValue={applicantName || ''}></input>
</div>

<div>
 <label>Loan Amount</label>
 <input type='text' name="loanAmount" onChange={handleChange} defaultValue={loanAmount || ''}></input>
</div>

<div>
      <button onClick={editLoanDetails}>Submit</button>
      </div>
      </>

)
}

export default EditLoan