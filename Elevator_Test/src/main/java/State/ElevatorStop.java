package State;

public class ElevatorStop extends ElevatorState{
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
        elevatorState = new ElevatorRest();
        return elevatorState;
    }

    @Override
    public ElevatorState executeStop() {
        return null;
    }

    @Override
    public String getElevatorState() {
        return null;
    }
}
