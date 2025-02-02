package factory.Interface;

public interface GameInterface{
    CharacterInterface createCharacter(String characterType);
    LocationInterface createLocation(String locationType);
}