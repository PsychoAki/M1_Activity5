package M2_Activity3;

public class Car {
    //Private attributes
    private String brand;
    private String model;
    private int year;

    //No-argument constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    //Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //Getter and Setter methods
    public String getBrand() {
        return brand;
    }
    public void brand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void model(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void year(int year) {
        this.year = year;
    }
    // Method to display car information
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}
