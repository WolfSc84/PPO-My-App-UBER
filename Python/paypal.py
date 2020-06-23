from payment import Payment

class Paypal(Payment):
    mail = str;

    def __init__(self, id, mail):
        super().__init__(id);
        self.mail = mail;