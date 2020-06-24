class Driver extends Account{
    
    constructor(id, name, document, email, password, license){
        super(id, name, document, email, password);
        this.license = license;
    }
}