public class App {
    private static final String INVALID_STRING = "Invalid Value";
    public static void main(String[] args) throws Exception {
        System.out.println(getDurationString(-40)); 
    }

    public static String getDurationString(int minutes, int seconds) {
        //Cek validasi input paramter
        if (minutes>=0 && seconds>=0 && seconds <=59){
            int hours = (int) minutes/60;
            int sisaMenit = minutes%60;


            //Format angka dua digit
            String stringHours = String.format("%02d", hours);
            String stringMinutes = String.format("%02d", sisaMenit);
            String stringSeconds = String.format("%02d", seconds);
            
            
            String output = stringHours + "h "+ stringMinutes + "m " + stringSeconds + "s";
            return output;
        }
        else{
            return INVALID_STRING;
        }
    }
    public static String getDurationString(int seconds) {
        //Cek validasi input paramter
        if (seconds>=0){
            int menit = (int) seconds/60;
            int sisaDetik = seconds%60;
            String output = getDurationString(menit, sisaDetik);
            return output;
        }
        else{
            return INVALID_STRING;
        }
    }
    

}
