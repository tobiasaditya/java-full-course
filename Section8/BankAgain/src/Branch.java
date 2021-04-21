import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    

    public String getName() {
        return this.name;
    }


    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String name, double initial){
        //Cek apakah udah ada di customers
        Customer checkCustomer = findCustomer(name);

        //Kalau belum ada, baru bisa tambah
        if(checkCustomer==null){
            this.customers.add(new Customer(name,initial));
            //System.out.println("Successfully added "+ name+" with "+ initial);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer checkCustomer = findCustomer(name);
        //Kalau ada, update transaksi
        if(checkCustomer!=null){
            checkCustomer.addTransaction(transaction);
            //System.out.println("Success added "+name+"transaction!");
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(int i =0;i<this.customers.size();i++){
            String customerName = this.customers.get(i).getName();
            if(customerName.equals(name)){
                return this.customers.get(i);
            }
        }
        return null;
    }


}

    

