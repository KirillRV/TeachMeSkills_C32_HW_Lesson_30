package factory;

import factory.Interface.CharacterInterface;
import factory.Interface.GameInterface;
import factory.Interface.LocationInterface;
import factory.character.DefaultGameFactory;
import factory.location.SituationGenerator;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameInterface factory = new DefaultGameFactory();
        SituationGenerator generator = new SituationGenerator();

        System.out.println("Выберите персонажа (маг, воин, стрелок):");
        String characterType = scanner.nextLine();

        System.out.println("Выберите местность (пустыня, лес, город):");
        String locationType = scanner.nextLine();

        CharacterInterface character = factory.createCharacter(characterType);
        LocationInterface location = factory.createLocation(locationType);

        System.out.println(generator.generateSituation(character, location));
        System.out.println(generator.generateAbilities(character));

        scanner.close();
    }
}