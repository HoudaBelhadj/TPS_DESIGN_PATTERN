package Service;

import java.util.ArrayList;
import java.util.List;

public class Building implements IBuilding{

    private int numberOfFloors;
    private List<Elevator> elevatorList;

    // Public constructor for creating buildings and instanciante elevators
    public Building(int numberOfFloors, String... elevators){
        this.numberOfFloors = numberOfFloors;
        instanciateElevators(elevators);
    }

    @Override
    public String requestElevator() {
        int min = 1;
        String availableElevator = "";
        List<Elevator> availableElevators = new ArrayList<Elevator>();

        // Add Elevators with Up Status
        for(Elevator elevator : elevatorList){
            if(elevator.getState().getElevatorState() == "UP" || elevator.getState().getElevatorState() == "REST"){
                availableElevators.add(elevator);
            }
        }
        for(Elevator elevator : availableElevators) {
            if (elevator.getCurrentFloor() >= min) {
                if (elevator.getCurrentFloor() >= min) {
                    min = elevator.getCurrentFloor();
                    availableElevator = elevator.getElevatorId();
                }
            }
        }
        return availableElevator;
    }

    @Override
    public String requestElevator(int floorNumber) {
        int min = numberOfFloors;
        String availableElevator = "";
        List<Elevator> availableElevators = new ArrayList<Elevator>();

        // create list of Available Elevators
        for(Elevator elevator : elevatorList){
            if(elevator.getState().getElevatorState() == "UP" && elevator.getCurrentFloor() < floorNumber){
                availableElevators.add(elevator);
            }
            if(elevator.getState().getElevatorState() == "DOWN" && elevator.getCurrentFloor() > floorNumber){
                availableElevators.add(elevator);
            }
            if(elevator.getState().getElevatorState() == "REST"){
                availableElevators.add(elevator);
            }
        }

        for(Elevator elevator : availableElevators) {
            if (Math.abs(elevator.getCurrentFloor() - floorNumber) <= min) {
                min = elevator.getCurrentFloor();
                availableElevator = elevator.getElevatorId();
            }
        }

        return availableElevator;

    }

    @Override
    public void move(String elevatorId, String status) {
        Elevator elevator = getElevatorById(elevatorId);

        switch (status){
            case "UP" :
                elevator.moveUp();
                break;
            case "DOWN" :
                elevator.moveDown();
                break;
            case "REST" :
                elevator.rest();
                break;
        }

    }

    @Override
    public void stopAt(String elevatorId, int floorNumber) {
        Elevator elevator = getElevatorById(elevatorId);
        elevator.stop();
        elevator.setCurrentFloor(floorNumber);
    }

    // Instanciate Elevators From Building Class
    private void instanciateElevators(String... elevators){
        this.elevatorList =  new ArrayList<Elevator>();
        for(String elevatorData : elevators){
            Elevator elevator = Elevator.newElevator(elevatorData);
            this.elevatorList.add(elevator);
        }
    }

    // Search Elevator by Id in the List
    private Elevator getElevatorById(String id){
        Elevator elevator = null;
        for(Elevator el : elevatorList){
            if(el.getElevatorId().equals(id)){
                elevator = el;
                break;
            }
        }
        return elevator;
    }

    @Override
    public String toString() {
        return "Building{" +
                "numberOfFloors=" + numberOfFloors +
                ", elevatorList=" + elevatorList +
                '}';
    }
}
