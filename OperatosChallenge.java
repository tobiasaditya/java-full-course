public class OperatosChallenge {
    public static void main(String[] args) {
        double myDouble = 20.00;
        double myDoubleTwo = 80.00;
        double result1 = (myDouble+myDoubleTwo)*100.00;
        double sisa = result1%40.00;
        boolean isZero = (sisa==0)? true:false;
        System.out.println("Apakah habis? " +isZero);

        if (isZero){
            System.out.println("Tidak ada sisa!");
        }
        else if(!isZero){
            System.out.println("Ada sisa!");
        }

    }
    
}
