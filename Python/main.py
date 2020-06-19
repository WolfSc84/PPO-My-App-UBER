from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo");
    car = Car("AMS234", Account("Andres Herrera","NPI1234"));
    print(vars(car));
    print(vars(car.driver));

    car2 = Car("QWY654", Account("Manuel Carmona", "NPI5678"))
    print(vars(car2));
    print(vars(car2.driver));
