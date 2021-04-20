public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        GroceryList groceryList = new GroceryList();

        //Add item
        groceryList.addItem("Cheese");
        groceryList.addItem("Water");
        groceryList.addItem("Apples");
        groceryList.addItem("Banana");

        groceryList.printGrocery();

        //Modify
        groceryList.modifyGrocery(1, "Pizza");
        groceryList.printGrocery();

        //Remove
        groceryList.removeItem(0);
        groceryList.printGrocery();

        //Find Item
        System.out.println(groceryList.findItem("Banana")); 


    }
}
