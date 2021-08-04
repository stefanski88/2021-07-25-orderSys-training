import './App.css';
import Header from './components/Header.js'
import CharacterCard from './components/CharacterCard.js'

function App() {

    return <div>
        <Header title = "Character Gallery"/>
        <CharacterCard index = {0}/>
        <CharacterCard index = {1}/>
    </div>
}

export default App;
