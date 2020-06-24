from payment import Payment

class Paypal(Payment):
    mail = str;

    def __init__(self, id, email):
        super().__init__(id);
        self.emailp = emailp;