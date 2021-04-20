import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts = new ArrayList<Contact>(); 
    private String myNumber;


    public MobilePhone(String myNumber) {
        this.myContacts.add(Contact.createContact("name", myNumber));
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact){
        int position = findContact(contact);
        if (position<0){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position>=0){
            myContacts.set(position, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position>=0){
            myContacts.remove(position);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact){
        System.out.println("Finding contact...");
        String nama = contact.getName();
        return findContact(nama);
    }

    private int findContact(String item){
        System.out.println("Using this");
        for (int i =0;i<myContacts.size();i++){
            //Pecah contact jadi nama dan nomor
            String nama = myContacts.get(i).getName();
            String nomor = myContacts.get(i).getPhoneNumber(); 
            if(nama == item || nomor == item){
                return i;
            }

        }
        return -1; 
    }

    public Contact queryContact(String name){
        for (int i =0;i<myContacts.size();i++){
            String nama = myContacts.get(i).getName();
            if(nama == name){
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i =0;i<myContacts.size();i++){
            System.out.println(i+1 + ". "+myContacts.get(i).getName()+ " -> "+myContacts.get(i).getPhoneNumber());
        }
    }

}
