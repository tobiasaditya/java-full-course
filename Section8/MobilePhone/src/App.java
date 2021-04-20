public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MobilePhone mobilePhone = new MobilePhone("12345");
        mobilePhone.printContacts();

        //Add Tom, 123456
        Contact contact1= new Contact("Tom", "123456");
        mobilePhone.addNewContact(contact1);
        mobilePhone.printContacts();

        //Add Tom again
        contact1= new Contact("Tom", "123456");
        mobilePhone.addNewContact(contact1);
        mobilePhone.printContacts();
        
        


    }
}
