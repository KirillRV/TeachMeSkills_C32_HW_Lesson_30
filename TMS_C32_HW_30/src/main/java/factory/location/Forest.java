package factory.location;

import factory.Interface.LocationInterface;

public class Forest implements LocationInterface {
    @Override
    public String getDescription() {
        return "густой лес с высокими деревьями и густой растительностью";
    }
}