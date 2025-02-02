package factory.character;

import factory.Interface.CharacterInterface;

class Warrior implements CharacterInterface {
    @Override
    public String getDescription() {
        return "Воин в тяжелых доспехах с мечом и щитом";
    }

    @Override
    public String getAbilities() {
        return "Сила, выносливость, владение оружием";
    }
}
