import logo from './logo.svg';
import './App.css';
import React,{useState} from "react";

import './main.css'

function App() {
  const Apikey='e675ac029e20e0d81266daa2302d57cb'
  const[weatherData,setweatherData]=useState([{}])
  const[city,setcity]=useState("")
  const getweather=(event)=>{
    if(event.key=="Enter"){
      fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&units=imperial&appid=${Apikey}`).then(
        Response=>Response.json()
      ).then(
        data=>{
          setweatherData(data)
          setcity("")
        }
      )
    }
  }
  return (
    <div className="App">
     <input className='input' placeholder='Entercity.....' value={city} onChange={e=>setcity(e.target.value)} onKeyPress={getweather}/>
      {typeof  weatherData.main==='undefined' ?(
        <div>
          <p>welcome to weather data!Enter in a city to get the weather of.</p>
        </div>
      ):(<div>
        <p className='name'>{weatherData.name}</p>
        <p className='temp'>Temp-{Math.round(weatherData.main.temp)}`f</p>
        <p className='weather'>{weatherData.weather[0].main}</p>
        <p className='pressure'>Pressure-{weatherData.main.pressure} hPa</p>
        <p className='humidity'>Humidity-{weatherData.main.humidity}%</p>
        <p className='wind'>wind speed-{weatherData.wind.speed}</p>
        <p className='max'>Max Temp-{weatherData.main.temp_max}`f</p>
       

      </div>)}
 
   </div>
  );
}

export default App;
