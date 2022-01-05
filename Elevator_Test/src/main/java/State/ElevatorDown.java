package State;

public class ElevatorDown extends ElevatorState {
    @Override
    public ElevatorState executeMoveDown() {
        return null;
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
        elevatorState = new ElevatorStop();
        return elevatorState;
    }

    @Override
    public String getElevatorState() {
        return "DOWN";
    }
}
