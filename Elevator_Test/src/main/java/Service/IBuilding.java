package Service;

public interface IBuilding {
    public String requestElevator();
    public String requestElevator(int floorNumber);
    public void move(String elevatorId, String status);
    public void stopAt(String elevatorId, int floorNumber);

}
