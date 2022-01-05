package Service;

import State.ElevatorRest;
import State.ElevatorState;

public class Elevator implements IElevator{

    private String elevatorId;
    private int currentFloor;
    private ElevatorState state;

    // private Constructor for creating Elevator
    private Elevator(String elevatorId, int currentFloor, ElevatorState state) {
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
        this.state = state;
    }

    // Factory Method ==> to instanciate Elevators
    public static Elevator newElevator(String elevatorData){
        String[] arrOfStr = elevatorData.split(":", 2);
        String elevatorId = arrOfStr[0];
        int currentFloor = Integer.parseInt(arrOfStr[1]);
        return new Elevator(elevatorId,currentFloor,new ElevatorRest());
    }

    @Override
    public void moveDown() {
        this.state = state.executeMoveDown();
    }

    @Override
    public void moveUp() {
        this.state = state.executeMoveUp();
    }

    @Override
    public void rest() {
        this.state = state.executeRest();
    }

    @Override
    public void stop() {
        this.state = state.executeStop();
    }

    @Override
    public void doActivity() {

    }

    // Getters && Setters


    public String getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(String elevatorId) {
        this.elevatorId = elevatorId;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public ElevatorState getState() {
        return state;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "elevatorId='" + elevatorId + '\'' +
                ", currentFloor=" + currentFloor +
                '}';
    }
}
