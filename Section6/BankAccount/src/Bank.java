public class Bank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public Bank(){
        //This "this" called the constructor with parameter, inputing all of the parameter
        this("212",0.0,"Default Name","Default email","Default Number");
        System.out.println("Empty constructor was called");
    }

    
    //Constructor with parameter
    public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor-parameter was called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public Bank(double balance, String customerName, String email, String phoneNumber) {
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance (double balance){
        this.balance=balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFund(double deposit){
        this.balance+=deposit;
        System.out.println("Success deposit. Your current balance is = "+this.balance);
    }

    public void withdrawFund(double withdraw){
        if (this.balance-withdraw>=0){
            this.balance-=withdraw;
            System.out.println("Success withdraw. Your current balance is = " +this.balance);
        }
        else{
            System.out.println("Insufficient balance! Poor!");
        }
    }


}
