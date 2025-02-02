package factory.character;

import factory.Interface.CharacterInterface;
import factory.Interface.GameInterface;
import factory.Interface.LocationInterface;
import factory.location.City;
import factory.location.Desert;
import factory.location.Forest;


// 6. DefaultGameFactory Class
public class DefaultGameFactory implements GameInterface {
    @Override
    public CharacterInterface createCharacter(String characterType) {
        switch (characterType.toLowerCase()) {
            case "маг": return new Mage();
            case "воин": return new Warrior();
            case "стрелок": return new Archer();
            default: throw new IllegalArgumentException("Неизвестный тип персонажа");
        }
    }

    @Override
    public LocationInterface createLocation(String locationType) {
        switch (locationType.toLowerCase()) {
            case "пустыня": return new Desert();
            case "лес": return new Forest();
            case "город": return new City();
            default: throw new IllegalArgumentException("Неизвестный тип местности");
        }
    }
}