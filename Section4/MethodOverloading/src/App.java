public class App {
    public static void main(String[] args) throws Exception {
        FeetInchToCenti(6, 0);
        FeetInchToCenti(10);
    }
    public static double FeetInchToCenti(double feet, double inch){
        if (feet>=0 && inch >=0 && inch <= 12){
            
            double feetInch = 12 * feet; 
            double inchFeetCenti= 2.54 * feetInch;
            
            double inchCenti = 2.54 * inch;

            System.out.println(feet + " feet, " + inch + " inches = " + (inchCenti+inchFeetCenti) + " cm");
            return inchCenti+inchFeetCenti;
        }

        else{
            return -1;
        }
    }
    public static double FeetInchToCenti(double inch){
        if (inch >=0){
            
            double feet = (int) inch/12;
            double sisaInch = inch%12;

            double output = FeetInchToCenti(feet, sisaInch);
            return output;
        }

        else{
            return -1;
        }
    }
    

}
