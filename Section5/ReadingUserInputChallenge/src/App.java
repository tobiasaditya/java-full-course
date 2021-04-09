import java.util.Scanner;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int counter=1;
        int sum=0;
        int input=0;
        while(counter<=10){
            System.out.println("Enter number #"+counter);
            boolean hasInt = scanner.hasNextInt();
            
            if(hasInt){
                input = scanner.nextInt();
                scanner.nextLine();
                sum+=input;
                counter++; 
            }
            else{
                System.out.println("Invalid Number");

            }
            
        }
        System.out.println(sum);
    }


}
