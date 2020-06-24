public class Account {
    Integer id;
    String name;
    String document;
    String password;
    String email;

    public Account(String name, String document, String password, String email, Integer id) {
        this.name = String.valueOf(name);
        this.id = id;
        this.document = String.valueOf(document);
        this.email = String.valueOf(email);
        this.password = String.valueOf(password);    
    }    
}