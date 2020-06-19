public class Account {
    Integer id;
    String name;
    String document;
    String password;

    public Account(final String name, final String document) {
        this.name = String.valueOf(name);
        this.document = String.valueOf(document);    
    }    
}