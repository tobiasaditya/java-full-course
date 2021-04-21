import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts = new ArrayList<Contact>(); 
    private String myNumber;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact){
        int position = findContact(contact.getName());
        
        if (position<0){
            this.myContacts.add(contact);
            System.out.println(contact.getName() + " was added to contacts.");
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position>=0){
            this.myContacts.set(position, newContact);
            System.out.println(oldContact.getName()  + " was updated");
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact.getName());
        if (position>=0){
            this.myContacts.remove(position);
            System.out.println(contact.getName()+" was removed");
            return true;
        }
        return false;
    }

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
        //String nama = contact.getName();
        //return findContact(nama);
    }

    private int findContact(String item){
        System.out.println("Using this");
        for (int i =0;i<this.myContacts.size();i++){
            //Pecah contact jadi nama dan nomor
            String nama = this.myContacts.get(i).getName();
            if(nama.equals(item)){
                return i;
            }

        }
        return -1; 
    }

    public Contact queryContact(String name){
        for (int i =0;i<this.myContacts.size();i++){
            String nama = this.myContacts.get(i).getName();
            if(nama.equals(name)){
                return this.myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i =0;i<this.myContacts.size();i++){
            System.out.println(i+1 + ". "+this.myContacts.get(i).getName()+ " -> "+this.myContacts.get(i).getPhoneNumber());
        }
    }

}
