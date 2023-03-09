import logo from './logo.svg';
import './App.css';
import {useState} from "react";

function App() {
  const [topicName, setTopicName] = useState('')

  return (
    <div className="App">
      <header className="App-header">
        Choose a topic to investigate:
          <input value={topicName} onChange={(e) => setTopicName(e.target.value)}/>
          <button onClick={() => alert(topicName)}>Submit</button>
      </header>
    </div>
  );
}

export default App;
