import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchArrayList = new ArrayList<Branch>();

    public boolean addBranch(Branch branch){
        branchArrayList.add(branch);
        return true;
    }

    public boolean addCustomer(String branchName, Customer customer){
        int position = findBranch(branchName);
        if(position>=0){
            branchArrayList.get(position).addCustomer(customer);
            return true;
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double transaction){
        int position = findBranch(branchName);
        if(position>=0){
            Branch branch = branchArrayList.get(position);
            System.out.println("Add transaction on branch " + branch.getName());
            //Cari customernya
            branch.addTransaction(customerName, transaction);
            return true;
        }
        return false;
    }

    public int findBranch(String branchName){
        for(int i = 0;i<branchArrayList.size();i++){
            Branch branch =branchArrayList.get(i);
            String name = branch.getName();
            if(name.equals(branchName)){
                //Add customer to this branch
                return i;
            }
        }
        return -1;
    }

    public void printBranch(){
        for(int i =0;i<branchArrayList.size();i++){
            System.out.println(branchArrayList.get(i).getName());
            branchArrayList.get(i).printCustomerList();
        }
    }
    
}
