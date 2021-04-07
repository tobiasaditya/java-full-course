public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getEvenDigitSum(-120));
    }

    public static int getEvenDigitSum(int number) {
        if (number>=0){
            int sum=0;
            int digit=0;
            while(number/10!=0){
                digit =  number%10;
                if (digit%2==0){
                    sum+=digit;
                }
                number/=10;
            }

            //Khusus kalo dah tinggal digit pertama
            if (number%2==0){
                sum+=number;
            }

            return sum;
        }
        else{
            return -1;
        }
    }
}
