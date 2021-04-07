public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first<10 || second<10){
            return -1;
        }
        else{
            int lower=0;
            if(first<second){
                lower=first;
            }else{
                lower=second;
            }

            //Looping sampe lower
            int divider=0;
            for(int i=1;i<=lower;i++){
                if (first%i==0 && second%i==0){
                    divider = i;
                }
            }

            return divider;
        }
    }
}
