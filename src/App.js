import './App.css';
import {Routes,Route} from 'react-router-dom'
import ShowAll from './components/ShowAll';
import AddLoan from './components/AddLoan';
import MenuBar from './components/MenuBar';
import Home from './components/Home';
import EditLoan from './components/EditLoan';
function App() {
  return (
    <>
    <MenuBar></MenuBar>

    <Routes>
    <Route path="/" element={<Home/>}  />
    <Route path="/all" element={<ShowAll/>}  />
    <Route path="/add" element={<AddLoan/>}  />
    <Route path="/edit/:key" element={<EditLoan/>} />
    </Routes>
    </>  );
}

export default App;
