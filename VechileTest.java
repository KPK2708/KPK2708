abstract class Vehicle {
    public abstract void startEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine starts with a key turn or push button.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starts with a kick or button start.");
    }
}

public class VehicleTest {
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        vehicleTestDrive(car);
        vehicleTestDrive(motorcycle);
    }
}
