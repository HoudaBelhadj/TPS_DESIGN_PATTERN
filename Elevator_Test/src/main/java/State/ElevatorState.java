package State;

public abstract class ElevatorState {

    protected ElevatorState elevatorState;

    public abstract ElevatorState executeMoveDown();
    public abstract ElevatorState executeMoveUp();
    public abstract ElevatorState executeRest();
    public abstract ElevatorState executeStop();
    public abstract String getElevatorState();
}
