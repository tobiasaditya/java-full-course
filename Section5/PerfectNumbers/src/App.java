public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number<1){
            return false;
        }
        else{
            int sum=0;

            for(int i=1;i<number;i++){
                if(number%i==0){
                    sum+=i;
                }
            }

            if(sum==number){
                return true;
            }

            else{
                return false;
            }
        }
    }
}
