public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(canPack(2,1,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //Cek untuk yang besar
        if (bigCount<0 || smallCount <0 || goal <0){
            return false;
        }
        int sisa = goal;
        for (int i=1;i<=bigCount;i++){
            sisa-=5;
            if (sisa<0){
                sisa+=5;
                break;
            }
            else if(sisa==0){
                break;
            }
        }
        
        if (sisa==0){
            return true;
        }
        else{
            for (int i =1;i<= smallCount;i++){
                sisa--;
                if(sisa==0){
                    break;
                }
            }    
        
            if(sisa!=0){
                return false;
            }
            else{
                return true;
            }
        }
    }
}
