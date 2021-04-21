import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionArrayList;

    public Customer(String name, Double transaction) {
        this.name = name;
        transactionArrayList = new ArrayList<Double>();
        this.transactionArrayList.add(transaction);
    }


    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransaction() {
        return this.transactionArrayList;
    }

    public Customer createCustomer(String name, Double transaction){
        return new Customer(name, transaction);
    }

}
