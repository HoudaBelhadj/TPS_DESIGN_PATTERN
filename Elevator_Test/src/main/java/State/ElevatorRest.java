package State;

public class ElevatorRest extends ElevatorState{
    @Override
    public ElevatorState executeMoveDown() {
        elevatorState = new ElevatorDown();
        return elevatorState;
    }

    @Override
    public ElevatorState executeMoveUp() {
        elevatorState = new ElevatorUp();
        return elevatorState;
    }

    @Override
    public ElevatorState executeRest() {
        return null;
    }

    @Override
    public ElevatorState executeStop() {
        elevatorState = new ElevatorStop();
        return elevatorState;
    }

    @Override
    public String getElevatorState() {
        return "REST";
    }

}
