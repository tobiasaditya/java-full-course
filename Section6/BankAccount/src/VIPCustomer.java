public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String email;
    

    public VIPCustomer() {
        this("Default name",0.0,"user@example.com");
    }


    public VIPCustomer(String name, double creditLimit) {
        this(name,creditLimit,"another@example.com");
    }


    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }




    
}
