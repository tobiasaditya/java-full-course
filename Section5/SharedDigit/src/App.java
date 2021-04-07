public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if (x>=10 && x<=99 && y>=10 && y<=99){
            //Ambil digit X buat referensi
            int digitX=0;
            int digitY=0;

            
            while (x/10!=0 || x>0){
                //Digit X
                digitX = x%10;
                
                //Ambil digit Y buat dibandingkan
                int tesY = y;
                while (tesY/10!=0 || tesY>0){
                    //Digit Y
                    digitY=tesY%10;
                    tesY/=10;
                    if (digitX==digitY){
                        return true;
                    }
                }

                x/=10;
            }
            return false;
        }
        else{
            return false;
        }
    }
}
