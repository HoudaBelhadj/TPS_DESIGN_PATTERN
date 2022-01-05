package State;

public class ElevatorUp extends ElevatorState{

    @Override
    public ElevatorState executeMoveDown() {
        elevatorState = new ElevatorDown();
        return elevatorState;
    }

    @Override
    public ElevatorState executeMoveUp() {
        return null;
    }

    @Override
    public ElevatorState executeRest() {
        elevatorState = new ElevatorRest();
        return elevatorState;
    }

    @Override
    public ElevatorState executeStop() {
        elevatorState = new ElevatorStop();
        return elevatorState;
    }

    @Override
    public String getElevatorState() {
        return "UP";
    }
}
