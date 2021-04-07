public class App {
    public static void main(String[] args) throws Exception {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes>=0){
            long hours = minutes/60;
            long days = hours/24;
            long years = days/365;
            long sisaDays = days%365;

            System.out.println(minutes + " min = " + years + " y and " + sisaDays + " d");

        }
        else{
            System.out.println("Invalid Value");
        }
        
    }
}
