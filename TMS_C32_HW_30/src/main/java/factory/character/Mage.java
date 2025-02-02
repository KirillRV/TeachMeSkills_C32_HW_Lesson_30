package factory.character;

import factory.Interface.CharacterInterface;

class Mage implements CharacterInterface {
    @Override
    public String getDescription() {
        return "Маг с длинной мантией и волшебной палочкой";
    }

    @Override
    public String getAbilities() {
        return "Магия огня, льда, молний";
    }
}