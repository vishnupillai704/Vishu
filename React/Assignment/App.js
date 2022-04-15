import logo from './logo.svg';
import './main.css';
import Q2 from './components/Q2';
import Q3 from './components/Q3';
import Q4 from './components/Q4';
import Q5 from './components/Q5';
import Home from './components/Home';
import {BrowserRouter as Routers,Routes,Link} from 'react-router-dom';
import  {Route} from 'react-router-dom';
import Project from './components/Project';
import Services from './components/Services';
import Contact from './components/Contact';


function App() {
  return (
    <div className="App">
    
       <Routers>
        <nav>
          <Link className='Home' to="/Home">HOME</Link>
          </nav>
          <nav>
          <Link className='Projects' to="/Projects">PROJECTS</Link>
          </nav>
          <nav>
          <Link className='Services' to="/Services">SERVICES</Link>
          </nav>
          <nav>
          <Link className='Contact' to="/Contact">CONTACT</Link>
        </nav>
        <Routes>
          <Route path="/Home" element={<Home/>}/>
          <Route path="/Projects" element={<Project/>}/>
          <Route path="/Services" element={<Services/>}/>
          <Route path="/Contact" element={<Contact/>}/>
        </Routes>
      </Routers> 

      {/* <Home/> */}
      {/* <Q2/> */}
      {/* <Q3/> */}
      {/* <Q4/> */}
      {/* <Q5/> */}
    </div>
  );
}

export default App;
