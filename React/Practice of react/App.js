import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet';
import Welcome from './components/Welcome';
import { Component } from 'react';
import Message from './components/Message';
import FunctionalClick from './components/FunctionalClick';
import ClassClick from './components/ClassClick';
import ParentComponent from './components/ParentComponent';
import Usergreeting from './components/Usergreeting';
import NameList from './components/NameList';
import Stylesheet from './components/Stylesheet';
import Form from './components/Form';
import LifecycleA from './components/LifecycleA';
import RefsDemo from './components/RefsDemo';
import Cliclhandler from './components/Cliclhandler';
import Hoverhandler from './components/Hoverhandler';
import {BrowserRouter as Routers,Routes,Link} from 'react-router-dom';
import  {Route} from 'react-router-dom';
import Home from './components/Home';
import About from './components/About';
import Error from './components/Error';
import Hookcounter from './components/Hookcounter';
import HookcounterTwo from './components/HookcounterTwo';
import HookcounterThree from './components/HookcounterThree';
import HookcounterFour from './components/HookcounterFour';
import HookcounterFive from './components/HookcounterFive';
import HookcounterSix from './components/HookcounterSix';
import HookDatafetching from './components/HookDatafetching';
import HookDatafetching2 from './components/HookDatafetching2';

function App () {
  return (
     
    <div className="App">
        {/* <Routers>
       <nav>
       <Link to="/home">Home</Link>
         <Link to="/about">About</Link>
       </nav>
       <Routes>
     
      <Route path="/home" element={<Home/>}  />
     <Route path="/about/:username" element={<About/>} />
      <Route path="*" element={<Error/>}/> 
     </Routes>
     </Routers>  */}
     
       {/* <Hookcounter/>
       <HookcounterTwo/>
       <HookcounterThree/>
       <HookcounterFour/>
       <HookcounterFive/> */}
       {/* <HookDatafetching/> */}
       {/* <HookDatafetching2/> */}
       
       {/* <HookcounterSix/> */}

        {/* <Hoverhandler/>
       <Cliclhandler/>
       <RefsDemo/>
       <LifecycleA/>
       <Form/>
      <Stylesheet primary={true} />
       <NameList/>
      <Usergreeting/>
      <ParentComponent/>
      <ClassClick/>
      <FunctionalClick/>
      <Message/> 
       <Greet name="vishnu" age="21" hair="black">This is vishnu info</Greet>
      <Greet name="suraj" age="20"></Greet>
      <Greet name="rajiv" age="21"></Greet>
      <Welcome name="vishnu" age="21" hair="black"></Welcome>
      <Welcome name="suraj" age="20"></Welcome> */}
     
   
    </div>
     
    
 
  );
}


export default App;
