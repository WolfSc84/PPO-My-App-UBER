from account import Account

class Car:
    id = int;
    license = str;
    driver = Account("","");
    passenger = str;

    def __init__(self, license, driver):
        super().__init__();
        self.driver = driver;
        self.license = license;
