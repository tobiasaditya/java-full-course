public class StringClass {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("The string is " + myString);
        myString = myString + ", and this is more!";
        System.out.println("The string is "+ myString);
        myString = myString + "\u00A9 2021";
        System.out.println("The string is "+ myString);

        String myLastString = "10";
        int myInt = 50;
        System.out.println(myLastString+myInt);

        double myDouble = 20.60;
        System.out.println(myLastString+myDouble);


    }
}
