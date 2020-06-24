from account import Account

class Driver(Account):
    license = str;

    def __init__(self, id, name, document, password, email, license):
       super().__init__(id, name, document, password, email);
       self.license = license;