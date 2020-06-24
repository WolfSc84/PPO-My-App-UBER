from account import Account

class User(Account):
    def __init__(self, id, name, document, password, email):
       super().__init__(id, name, document, password, email);