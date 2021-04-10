public class Bedroom {
    private String type;

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Bed bed;
    private Ceiling ceiling;
    private Lamp lamp;

    public Bedroom(String type, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.type = type;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        System.out.println("Bedroom --> Making bed |");
        return this.lamp;
    }

    public void makeBed(){
        bed.make();
    }


}
