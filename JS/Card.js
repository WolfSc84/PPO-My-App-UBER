class Card extends Payment {
    constructor(id, number, cvv, date, name) {
        super(id);
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}