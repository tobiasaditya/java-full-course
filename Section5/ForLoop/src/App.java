public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
/* 
        for (int i=0;i<5;i++){
            System.out.println(i);
        }

        //Challenge
        for (int i=2;i<=8;i++){
            System.out.println(String.format("%.2f",calculateInterest(10000, i)));

        } */

        //Challenge again
        int count=0;
        for (int i=10;i<=50;i++){
            if(isPrime(i)){
                count++;
                
                System.out.println(i);
                if(count==3){
                    break;
                }
            }

            
        }
    }
    
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;

        }
    
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
    }
}
