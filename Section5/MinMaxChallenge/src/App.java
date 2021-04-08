import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number=0;

        //Min max dikasi nilai segini biar pas input pertama langsung true kondisionalnya
        int min = 2147483647;
        int max= -2147483647;
        while(true){
            System.out.println("Enter Number:");

            boolean isInt = scanner.hasNextInt();

            if (isInt){
                number = scanner.nextInt();
                if(number>max){
                    max=number;
                }

                if(number<min){
                    min=number;
                }
            }

            else{
                break;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        scanner.close();
    }
}
