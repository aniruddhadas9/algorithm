import logo from './assets/logo.svg';
import './App.css';
import {SelectBoxesOnMouseMove} from "./components/star-selection/select-boxes-on-mouse-move";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <SelectBoxesOnMouseMove/>
      </header>
    </div>
  );
}

export default App;
