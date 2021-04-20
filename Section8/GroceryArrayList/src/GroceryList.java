import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void printGrocery(){
        System.out.println("You have "+groceryList.size() +" item");
        for (int i=0;i<groceryList.size();i++){
            System.out.println(i+1 +". "+groceryList.get(i));
        }
    }

    public void modifyGrocery(int position, String item){
        groceryList.set(position, item);
    }

    public void removeItem(int position){
        groceryList.remove(position);
    }

    public String findItem(String item){
        int position = groceryList.indexOf(item);
        return groceryList.get(position);
    }


}
