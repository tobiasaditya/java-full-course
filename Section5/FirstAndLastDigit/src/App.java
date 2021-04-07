public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number>=0){
            //Last digit
            int lastDigit = number%10;

            //FirstDigit
            while(number/10!=0){
                number/=10;
            }

            int firstDigit = number;

            return lastDigit+firstDigit;

        }
        else{
            return -1;
        }
    }
}
