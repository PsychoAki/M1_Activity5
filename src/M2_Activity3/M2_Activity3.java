package M2_Activity3;

public class M2_Activity3 {
    public static void main(String[] args) {
        Car myCar = new Car(); // No-argument constructor
        myCar.brand("Toyota");
        myCar.model("Corolla");
        myCar.year(2020);

        myCar.displayInfo();    
        
        Car myCar2 = new Car("Honda", "Civic", 2019); // Using parameterized constructor
        System.out.println();
        myCar2.displayInfo();

    }
}
