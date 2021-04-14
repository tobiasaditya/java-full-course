public class Hamburger {
    public String name;
    public String meat;
    public double price;
    public String breadRollType;

    //Addition
    private String addition1Name;
    private double addition1Price=0;
    private String addition2Name;
    private double addition2Price=0;
    private String addition3Name;
    private double addition3Price=0;
    private String addition4Name;
    private double addition4Price=0;
    

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        
        this.addition1Name=addition1Name;
        this.addition1Price=addition1Price;
        System.out.println("Added " + this.addition1Name + " for $"+this.addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
        System.out.println("Added " + this.addition2Name + " for $"+this.addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
        System.out.println("Added " + this.addition3Name + " for $"+this.addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
        System.out.println("Added " + this.addition4Name + " for $"+this.addition4Price);
    }
    
    public double itemizehamburger(){
        return this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
    }
    
    
}
