public class App {
    public static void main(String[] args) throws Exception {
        printConversion(2.0);
    }
    
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
        else{
            long milesPerHour = Math.round(kilometersPerHour/1.609);
            return milesPerHour;
        }
    }
    
    public static void printConversion (double kilometersPerHour){
        if (kilometersPerHour>=0){
            long output = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+output+" mi/h");
            }
        else{
            System.out.println("Invalid Value");
        }
    }
}

