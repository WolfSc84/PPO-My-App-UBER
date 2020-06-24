public class Driver extends Account{
    
    String license;

    public User(String name, String document, String password, String email, Integer id, String license) {
        super(name, document, password, email, id);
        this.license = license;
    }
}