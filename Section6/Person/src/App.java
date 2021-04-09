public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person person = new Person();
        person.setFirstName("Tobias");
        person.setLastName("Aditya");
        person.setAge(23);

        System.out.println(person.getFullName());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        
        
    }
}
