public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println("subtract= "+calculator.getSubtractionResult());
        System.out.println("multiply= "+calculator.getMultiplicationResult());
        System.out.println("divide= "+calculator.getDivisionResult());
        

    }
}
