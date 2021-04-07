public class App {
    public static void main(String[] args) throws Exception {
        //JIKA PAKE IF
        /* int value = 1;

        if (value == 1){
            System.out.println("Value was 1");
        }

        else if (value ==2){
            System.out.println("Value was 2");
        }
        
        else if (value ==3){
            System.out.println("Value was 3");
        }

        else{
            System.out.println("Value wasn't 1, 2, oe 3");
        } */

        int switchValue = 5;

        switch (switchValue){
            case 1:
            System.out.println("Value was 1");
            break;

            case 2:
            System.out.println("Value was 2");
            break;

            case 3:case 4:case 5:
            System.out.println("Value was 3, 4, or 5");
            System.out.println("It was actually " + switchValue);
            break;

            default:
            System.out.println("It wasn't 1-5");
            break;
        }

        //Challenge from TIM, using char datatype
        char switchChar = 'f';

        switch (switchChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
            System.out.println("It was " + switchChar);
            break;

            default:
            System.out.println("It's neither of A-E");
            break;
        }


        String month = "November";

        switch(month.toLowerCase()){
            case "january": case "november": case "desember":
            System.out.println("It was " + month);
            break;

            default:
            System.out.println("Not Sure");
            break;
        }
    }

}
