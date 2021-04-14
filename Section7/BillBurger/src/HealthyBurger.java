public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price=0;
    private String healthyExtra2Name;
    private double healthyExtra2Price=0;
    
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Usual");
        //TODO Auto-generated constructor stub
    }
    
    public void addHealthyAddition1(String addition1Name, double addition1Price){
        
        this.healthyExtra1Name=addition1Name;
        this.healthyExtra1Price=addition1Price;
        System.out.println("Added " +this.healthyExtra1Name + "for $" + this.healthyExtra1Price);
    }

    public void addHealthyAddition2(String addition2Name, double addition2Price){
        this.healthyExtra2Name=addition2Name;
        this.healthyExtra2Price=addition2Price;
        System.out.println("Added " +this.healthyExtra2Name + "for $" + this.healthyExtra2Price);
    }

    public double itemizehamburger(){
        return this.price+this.healthyExtra1Price+this.healthyExtra2Price;
    }
}   
