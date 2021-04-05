public class FloatandDouble {
    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Minimum FLoat Value = " + myMinFloat);
        System.out.println("Maximum FLoat Value = " + myMaxFloat);
        
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Minimum Double Value = " + myMinDouble);
        System.out.println("Maximum Double Value = " + myMaxDouble);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;

        //Double, sama kayak int, jadi default untuk desimal!
        double myDoubleValue = 5.00/3.00;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);

        //Lebih presisi!
        System.out.println(myDoubleValue);
        
        //Challenge from TIM!
        double pounds = 1;
        double kilos = pounds*0.45359237;
        System.out.println(pounds + " pounds = " + kilos + " kg");

    }
    
}
