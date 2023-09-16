import axios from 'axios';


const url = "http://localhost:4000/loans";

export const getallLoans = async (id) => {
    id = id || '';
    return await axios.get(`${url}/${id}`);
}

export const addLoan = async (Loan) => {
    return await axios.post(url,Loan);
}

export const editLoan = async (id, Loan) => {
    console.log(id,Loan)
    return await axios.put(`${url}/${id}`,Loan);
}


export const deleteLoan = async (id) => {
    return await axios.delete(`${url}/${id}`);
}