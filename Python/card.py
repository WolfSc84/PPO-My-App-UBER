from payment import Payment

class Card(Payment):
    name = str;
    number = int;
    cvv = int;
    date = int;

    def __init__(self, id, number, name, cvv, date):
        super().__init__(id);
        self.name = name;
        self.cvv = cvv;
        self.date = date;
        self.number = number;
        