import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        Branch checkBranch = findBranch(name);

        if (checkBranch==null){
            this.branches.add(new Branch(name));
            //System.out.println("Successfully added "+name+" branch!");
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initial){
        //Cek branch ada ato engga
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.newCustomer(customerName, initial);
            }
        return false;
        }
        
    


    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        //Cek branch ada ato engga
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customerName, transaction);
            }

        return false;
    }

    private Branch findBranch(String name){
        for(int i =0;i<this.branches.size();i++){
            String branchName = this.branches.get(i).getName();
            if(branchName.equals(name)){
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean isPrintTransaction){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            System.out.println("Customer details for branch "+branchName);
            for(int i =0;i<branch.getCustomers().size();i++){
                Customer customer = branch.getCustomers().get(i);
                System.out.println("Customer: "+customer.getName()+"["+(i+1)+"]");
                if (isPrintTransaction){
                    System.out.println("Transactions");
                    for(int j=0;j<customer.getTransactions().size();j++){
                        System.out.println("["+(j+1)+"] Amount "+customer.getTransactions().get(j));
                    }
                }

            }
            return true;
        }
        return false;
    }

}
