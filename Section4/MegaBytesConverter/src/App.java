public class App {
    public static void main(String[] args) throws Exception {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes = Math.round(kiloBytes/1024);
            int sisaKilo = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " +sisaKilo + " KB");
        }
        
    }
}
