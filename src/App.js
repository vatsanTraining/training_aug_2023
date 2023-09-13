import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import Content from './components/Content';
import Counter from './poc/Counter';

function App() {
  const links=[
    {linkTo:'/home',linkText:'Banking'},
    {linkTo:'/borrow',linkText:'Borrowing'},
    {linkTo:'/investment',linkText:'Investment'}
]

  return (
    <div>
      <Header majHeading={'Bank of Buruda'} minorHeading={'India'} links={links} ></Header>
      <Content></Content> 
    </div>
  );
}

export default App;
