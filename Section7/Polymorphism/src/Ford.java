public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
        //TODO Auto-generated constructor stub
    }
    
    public String startEngine(){
        return "Ford --> startEngine()";
    }

    public String accelerate(){
        return "Ford --> accelerate()";
    }

    public String brake(){
        return "Ford --> brake()";
    }
}
