public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Wall wall = new Wall(10, 10);

        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getArea());

        wall.setHeight(15);
        wall.setWidth(15);

        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getArea());


        
    }
}
