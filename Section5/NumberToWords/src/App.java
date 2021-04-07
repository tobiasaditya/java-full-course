public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getDigitCount(0));
        System.out.println(reverse(-2));
        numberToWords(245);
        
    }
    public static void numberToWords(int number) {
        if (number<0){
            System.out.println("Invalid Value");
        }
        else{
            //Reverse number
            int revNumber= reverse(number);
            int digit=0;
            for(int i=1;i<=getDigitCount(number);i++){
                digit=revNumber%10;
                switch(digit){
                    case 0:
                    System.out.println("Zero");
                    break;

                    case 1:
                    System.out.println("One");
                    break;

                    case 2:
                    System.out.println("Two");
                    break;

                    case 3:
                    System.out.println("Three");
                    break;

                    case 4:
                    System.out.println("Four");
                    break;

                    case 5:
                    System.out.println("Five");
                    break;

                    case 6:
                    System.out.println("Six");
                    break;

                    case 7:
                    System.out.println("Seven");
                    break;

                    case 8:
                    System.out.println("Eight");
                    break;

                    case 9:
                    System.out.println("Nine");
                    break;
                }

                revNumber/=10;
            }

        }
    }

    public static int reverse(int x) {
        int revNumber =0;
        while(x/10!=0 || x!=0){
            revNumber=(revNumber*10)+(x%10);
            x/=10;
        }
        return revNumber;
    }

    public static int getDigitCount(int number) {
        if(number<0){
            return -1;
        }
        else{
            int countDigit=0;
            do{
                countDigit++;
                number/=10;
            }
            while(number/10!=0 || number!=0);
            return countDigit;
        }
    }
}
