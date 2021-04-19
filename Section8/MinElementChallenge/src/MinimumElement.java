import java.util.Scanner;

public class MinimumElement {
    
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        return count;
    }


    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for(int i=0;i<count;i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int j=0;j<array.length;j++){
            if(array[j]<min){
                min=array[j];
            }
        }
        return min;
    }
}
