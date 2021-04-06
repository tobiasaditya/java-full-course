public class App {
    public static void main(String[] args) throws Exception {
        boolean output = shouldWakeUp(true, -1);
        System.out.println(output);
    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking){
            if (hourOfDay>=0 && hourOfDay<=23){
                if (hourOfDay < 8 || hourOfDay > 22)
                    return true;
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        
        
    }
}
