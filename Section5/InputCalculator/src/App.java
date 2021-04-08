import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        inputThenPrintSumAndEverage();
    }

    public static void inputThenPrintSumAndEverage() {
        Scanner scanner = new Scanner(System.in);
        

        double sum=0;
        int counter=0;
        int input=0;

        double avg=0.0;

        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                input = scanner.nextInt();
                scanner.nextLine();

                sum+=input;
                counter++;
                avg=sum/counter;
                System.out.println(avg);
            }
            else{
                break;
            }
        }
        
        System.out.println("SUM = "+sum+" AVG = " + Math.round(avg));
    }
}
