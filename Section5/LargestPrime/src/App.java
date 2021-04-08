public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number) {
        //Get all factor

        if (number<=1){
            return -1;
        }
        int factor=0;
        int prime=0;
        boolean isPrime=true;
        for(int i=1;i<=number;i++){
            if (number%i==0){
                factor = i;
                //System.out.println(factor);
                for (int j=2;j<=factor/2;j++){
                    
                    if(factor%j==0){
                        isPrime = false;
                        break;
                    }
                    isPrime=true;
                }
                if(isPrime){
                    prime=factor;
                }

                
            }
        }
        return prime;
    }

    /* public static boolean isPrime(int number) {
        for (int i=2;i<number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
        
    } */

}
