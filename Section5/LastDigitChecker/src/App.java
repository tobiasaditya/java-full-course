public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(hasSameLastDigit(11, 21, 30));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)){
            //Last digit masing"
            int digitX = x%10;
            int digitY = y%10;
            int digitZ = z%10;

            if (digitX==digitY || digitY==digitZ || digitX==digitZ){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number<10 || number >1000){
            return false;
        }
        else{
            return true;
        }
    }
}
