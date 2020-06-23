public class Paypal extends Payment {
    String mail;
    
    public Paypal(Integer id, String mail){
        super(id);
        this.mail = mail;
    }
}