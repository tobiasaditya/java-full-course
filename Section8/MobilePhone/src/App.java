import java.lang.invoke.ConstantCallSite;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("12345");
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        
        boolean operating = true;

        System.out.println("Menu Option:");
        System.out.println("1. Quit");
        System.out.println("2. Add new contact");
        System.out.println("3. Update existing contact");
        System.out.println("4. Remove contact");
        System.out.println("5. Query contact");
        System.out.println("6. Print all contacts");
        
        

        while (operating){
            System.out.println("Enter menu option");
            int choiceMenu = scanner.nextInt();
            scanner.nextLine();

            switch (choiceMenu){
                case 1:
                operating = false;
                break;

                case 2:
                addNewContact();
                break;

                case 3:

                updateContact();
                break;

                case 4:
                
                removeContact();
                break;

                case 5:
                queryContact();
                break;

                case 6:
                printContact();
                break;

                default:
                System.out.println("Try other menu.");
            }
        }

    }

    public static void addNewContact(){
        System.out.print("Enter new contact's name =  ");
        String name = scanner.nextLine();

        System.out.print("Enter new contact's number =  ");
        String number = scanner.nextLine();
        Contact contact = Contact.createContact(name, number);
        mobilePhone.addNewContact(contact);
        
    }

    public static void updateContact() {
        
        System.out.print("Enter old contact's name =  ");
        String oldName = scanner.nextLine();

        System.out.print("Enter new contact's name =  ");
        String newName = scanner.nextLine();

        System.out.print("Enter new contact's number =  ");
        String newNumber = scanner.nextLine();

        Contact oldContact = mobilePhone.queryContact(oldName);
        Contact newContact = Contact.createContact(newName, newNumber);

        mobilePhone.updateContact(oldContact, newContact);
    }

    public static void removeContact() {
        System.out.print("Enter contact's name =  ");
        String name = scanner.nextLine();

        

        mobilePhone.removeContact(mobilePhone.queryContact(name));
    }

    public static void queryContact() {
        System.out.print("Enter contact's name =  ");
        String name = scanner.nextLine();

        Contact contact = mobilePhone.queryContact(name);
        System.out.println(contact.getName() +"->" +contact.getPhoneNumber());
    }

    public static void printContact(){
        mobilePhone.printContacts();
    }
}
