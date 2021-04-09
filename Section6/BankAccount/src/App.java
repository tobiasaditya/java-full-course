public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* Bank bank = new Bank();
        
        //Bank bank = new Bank("12312",1000,"Tobias","tobias.aditya@gmail.com","081286700922");
        bank.setAccountNumber(123);
        bank.setBalance(1000);
        bank.setCustomerName("Tobias");
        bank.setEmail("tobias.aditya@gmail.com");
        bank.setPhoneNumber((812867009)); 

        System.out.println(bank.getAccountNumber());
        System.out.println(bank.getBalance());
        System.out.println(bank.getCustomerName());
        System.out.println(bank.getEmail());
        System.out.println(bank.getPhoneNumber());

        bank.withdrawFund(900);
        bank.withdrawFund(50);
        bank.withdrawFund(100);
        bank.depositFund(1000000); */

        VIPCustomer vipCustomer = new VIPCustomer("Tobias",10.0);

        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmail());
        
        
        
    }
}
