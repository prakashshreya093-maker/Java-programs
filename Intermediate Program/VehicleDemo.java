class Vehicle {
    protected String vehicle_type;
    public Vehicle(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }
    public void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}
class Car extends Vehicle {
    private String model_type;
    private String company_name;
    public Car(String vehicle_type, String model_type, String company_name) {
        super(vehicle_type); 
        this.model_type = model_type;
        this.company_name = company_name;
    }
    public void display() {
        super.display(); // Call display() of Vehicle class
        System.out.println("Car Model Type: " + model_type);
        System.out.println("Company Name: " + company_name);
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Two-Wheeler");
        v.display();
        System.out.println("--------------------------");
        Car c = new Car("Four-Wheeler", "Sedan", "Toyota");
        c.display();
    }
}

