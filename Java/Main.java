class Main{
    public static void main(final String[] args) {
        System.out.println("Hola mundo");
        final Car car = new Car("AMQ123", new Account("Andres Herrera", "NPI1234"));
        car.passenger = 4;
        car.printDataCar();

        final Car car2 = new Car("MZX432", new Account("Andrea Herrera", "NPI5678"));
        car2.passenger = 4;
        car2.printDataCar();

    }
}