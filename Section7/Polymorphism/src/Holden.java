public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
        //TODO Auto-generated constructor stub
    }

    public String startEngine(){
        return "Holden --> startEngine()";
    }

    public String accelerate(){
        return "Holden --> accelerate()";
    }

    public String brake(){
        return "Holden --> brake()";
    }
}
