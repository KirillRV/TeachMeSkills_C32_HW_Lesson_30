package factory.location;

import factory.Interface.CharacterInterface;
import factory.Interface.LocationInterface;

public class SituationGenerator {
    public String generateSituation(CharacterInterface character, LocationInterface location) {
        return character.getDescription() + " находится в " + location.getDescription() + ".";
    }
    public String generateAbilities(CharacterInterface character){
        return "Способности: " + character.getAbilities();
    }
}