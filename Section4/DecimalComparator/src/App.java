public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175)); 
    }

    public static boolean areEqualByThreeDecimalPlaces(double decimal1, double decimal2) {
        //Di cast ke integer biar round down
        int intdecimal1 = (int) (decimal1*1000);
        int intdecimal2 = (int) (decimal2*1000);
        System.out.println(intdecimal1);
        System.out.println(intdecimal2);
        if (intdecimal1==intdecimal2){
            return true;
        }
        else{
            return false;
        }
        

        
    }
}
