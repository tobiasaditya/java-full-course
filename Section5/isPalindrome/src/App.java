public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        
        int reverse = 0;
        int numberTest = Math.abs(number);
        number = Math.abs(number);

        while (numberTest/10 !=0){
            //Ambil digit terakhir angka
            reverse+=(numberTest%10);
            reverse*=10;
            numberTest/=10;
            //System.out.println(reverse);
            //System.out.println(numberTest);
        }

        //Digit terakhir
        reverse+=numberTest;
        if (reverse==number){
            return true;
        }
        else{
            return false;
        }


        
        
    }
}
