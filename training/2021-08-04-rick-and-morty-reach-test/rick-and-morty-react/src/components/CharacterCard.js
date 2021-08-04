import './CharacterCard.css'
import characterResponse from '../characters-response.json'

export default function CharacterCard(props) {
    const characters = characterResponse.results

    return (
    <img src={characters[props.index].image} alt={""}/>
    );
}