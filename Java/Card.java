public class Card extends Payment {
    Integer number;
    Integer cvv;
    Integer date;
    String name;

    public Card(Integer id, Integer number, Integer cvv, Integer date, String name){
        super(id);
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}