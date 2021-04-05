public class PrimitiveTypeChallenge {
    public static void main(String[] args) {
        
        //Challenge from Tim!
        byte nilaiByte = 10;
        short nilaiShort = 20;
        int nilaiInt = 30;
        long nilaiLong = 5000000000000000L+10L*(nilaiByte+nilaiInt+nilaiShort);
        System.out.println(nilaiLong);
    }
    
}
