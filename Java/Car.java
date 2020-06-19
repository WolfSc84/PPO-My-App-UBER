public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;   
    
    public Car(final String license, final Account driver) {
        this.driver = driver;
        this.license = String.valueOf(license);
    }

    void printDataCar(){
        System.out.println("License: " + license + "Driver: " + driver.name);
    }
}