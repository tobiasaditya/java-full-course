public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i =0;i<objectToSave.write().size();i++){
            System.out.println(objectToSave.write().get(i)+"successfully saved");
        }
    }

    public static void loadObject (ISaveable objectToLoad){
        
    }


}
