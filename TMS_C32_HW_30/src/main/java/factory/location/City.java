package factory.location;

import factory.Interface.LocationInterface;

public class City implements LocationInterface {
    @Override
    public String getDescription() {
        return "большой город с высокими зданиями и многолюдными улицами";
    }
}