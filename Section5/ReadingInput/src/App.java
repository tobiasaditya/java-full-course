import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Year of birth  = ");
        boolean isInteger = scanner.hasNextInt();

        if(isInteger){
            int year = scanner.nextInt();
            scanner.nextLine(); //INI DIBUTUHIN SETIAP SCANNER YANG GA ADA NEXTLINENYA!
            
    
            System.out.println("Your name  = ");
            String name = scanner.nextLine();
    
            int old = 2021-year;
            
            if(old>0 && old<100){
                System.out.println("You are " + name + " and " + old + " years old.");
            }
            else{
                System.out.println("Heh? Invalid age?");
            }
        }
        else{
            System.out.println("Invalid input of year");
        }
        scanner.close();
    }
}
