public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int number =4;
        int finishNumber = 22;
        int sumEven = 0;
        int count=0;
        while(number<=finishNumber){
            number++;
            if (!isEvenNumber(number)){
                //Continue the loop, break for that loop, but not break from THE loop
                continue;
            }

            System.out.println(number);

            count++;
            sumEven+=number;
            if(count==5){
                System.out.println(sumEven);
                break;
            }
            
        }

        //Do While loop example
        //BAGIAN do PASTI BAKAL DIJALANIN DI AWAL!
        do{
            count++;
            System.out.println(count);
        } while(count<10);

    }

    public static boolean isEvenNumber(int number) {
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
