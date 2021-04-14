public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Hamburger hamburger = new Hamburger("Default", "Bacon", 10.5, "Cinnamon");
        hamburger.addHamburgerAddition1("Mustard", 1.5);
        hamburger.addHamburgerAddition2("Tomato", 0.5);
        hamburger.addHamburgerAddition3("Ketchup", 1.5);
        System.out.println("Total = $" + hamburger.itemizehamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("MORE BACON", 1000);
        System.out.println("Total = $" + deluxeBurger.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Fish", 5.0);
        healthyBurger.addHealthyAddition1("Olives", 1.0);
        healthyBurger.addHealthyAddition2("Drink", 2.0);
        System.out.println("Total = " + healthyBurger.itemizehamburger()); 

    }
}
