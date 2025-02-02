package factory.character;

import factory.Interface.CharacterInterface;

class Archer implements CharacterInterface {
    @Override
    public String getDescription() {
        return "Стрелок с луком и колчаном стрел";
    }

    @Override
    public String getAbilities() {
        return "Меткость, скрытность, дальний бой";
    }
}