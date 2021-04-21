import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Branch branch1 = new Branch("Duri Kepa");
        Branch branch2 = new Branch("Taman Ratu");
        
        bank.addBranch(branch1);
        bank.addBranch(branch2);
        
        Customer customer1 = new Customer("Tobi", 12.0);
        Customer customer2 = new Customer("Lent", 10.0);

        Customer customer3 = new Customer("Beda", 500.0);


        bank.addCustomer("Duri Kepa", customer1);
        
        bank.addCustomer("Taman Ratu", customer2);
        bank.addCustomer("Taman Ratu", customer3);
        

        bank.printBranch();

        //Add transaction
        bank.addTransaction("Duri Kepa", "Tobi", 1.0);
        bank.addTransaction("Duri Kepa", "Tobi", 2.0);
        bank.addTransaction("Duri Kepa", "Tobi", 3.0);
        
        /* bank.addTransaction("Taman Ratu", "Lent", 1.0);
        bank.addTransaction("Taman Ratu", "Lent", 3.0);
        bank.addTransaction("Taman Ratu", "Lent", 6.0);
         */
        bank.printBranch();

    }
/* 
    public static void printInstruction(){
        System.out.println("Instruction!");
        System.out.println("1. Print All Data");
        System.out.println("2. Add ");
        
    } */

    
}
