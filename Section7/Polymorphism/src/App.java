public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Car car = new Car(4, "Base Car");

        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(4, "Mitsubishi");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Holden holden = new Holden(5, "Holden");
        holden.startEngine();
        holden.accelerate();
        holden.brake();

        Ford ford = new Ford(7,"Ford");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }
}
