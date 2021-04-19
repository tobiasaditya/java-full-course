
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Enter count = ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] output=readIntegers(count);
        System.out.println(Arrays.toString(output));

        int minValue = findMin(output);
        System.out.println("Minimum value = "+minValue);
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i=0;i<count;i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int j=0;j<array.length;j++){
            if(array[j]<min){
                min=array[j];
            }
        }
        return min;
    }

    
}
