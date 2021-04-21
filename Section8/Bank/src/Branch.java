import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customerArrayList;
    private String name;


    public Branch(String name) {
        customerArrayList = new ArrayList<Customer>();
        this.name = name;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return this.customerArrayList;
    }

    public String getName() {
        return this.name;
    }



    public boolean addCustomer(Customer customer){
        //Cek apakah udah ada di list ato belom
        int position = findCustomer(customer.getName());
        if(position<0){
            this.customerArrayList.add(customer);
            System.out.println(customer.getName() + " was added as new Customer.");
            return true;
        }
        System.out.println(customer.getName() +" was already on the list!");
        return false;
    }

    //Keknya cuma bisa buat query?
    public int findCustomer(Customer customer){
        return this.customerArrayList.indexOf(customer); 
    }

    public int findCustomer(String nama){
        for (int i =0;i<customerArrayList.size();i++){
            String nameCustomer = customerArrayList.get(i).getName();
            if(nama.equals(nameCustomer)){
                return i;
            }
        }
        return -1;    
    }

    public boolean addTransaction(String name, double transaction){
        //Cari index customer dulu
        int position = findCustomer(name);

        if(position>=0){
            this.customerArrayList.get(position).getTransaction().add(transaction);
            System.out.println("Transaction = "+ transaction +  " succesfully added to " + name + "'s account.");
            return true;
        }
        return false;
    }

    public void printCustomerList(){
        for (int i =0;i<customerArrayList.size();i++){
            System.out.println(i+". "+ customerArrayList.get(i).getName() + " -> " + customerArrayList.get(i).getTransaction());
        }
    }

    
}
