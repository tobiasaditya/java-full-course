public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(area(10,10));
    }
    public static double area(double radius) {
        if (radius<0){
            return -1.0;
        }
        else{
            double area = Math.PI*radius*radius;
            return area;
        }
    }

    public static double area(double x, double y){
        if (x<0 || y<0){
            return -1.0;
        }
        else{
            double area = x*y;
            return area;
        }
    }
}
