public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        if (number>=10){
            int sum=0;
            
            while(number/10 !=0){
                sum+=number%10;
                number=number/10;
                //System.out.println(sum);
            }
            return sum+number;
        }
        else{
            return -1;
        }
    }
}
