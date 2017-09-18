package Task_5;

public class vehicle_test {
    public static void main(String[] args) {
        vehicle car=new vehicle();
        car.Ride();
        car.printInfo();
        car.setFuelConsumption(10);
        car.setMaxSpeed(200);
        car.setName("My car");
        car.setPasangersCapacity(5);
        car.printInfo();
    }
}
