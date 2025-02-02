package factory.location;

import factory.Interface.LocationInterface;

public class Desert implements LocationInterface {
    @Override
    public String getDescription() {
        return "жаркая пустыня с песчаными дюнами и редкими растениями";
    }
}