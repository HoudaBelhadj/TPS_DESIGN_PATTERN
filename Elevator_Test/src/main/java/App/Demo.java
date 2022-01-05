package App;

import Service.Building;

public class Demo {
    public static void main(String[] args) {
        Building building = new Building(10,"id1:1","id2:6");
//        building.move("id1","UP");
//        building.move("id2","DOWN");
//        building.move("id3","UP");
//        building.stopAt("id3",7);

        System.out.println("The Elevator that should be requested is : ");
        System.out.println(building.requestElevator(5));
    }
}
