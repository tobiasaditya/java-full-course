public class Bed {
    private String type;
    private int pillow;
    private int height;
    private int sheets;

    public Bed(String type, int pillow, int height, int sheets, int quilt) {
        this.type = type;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    private int quilt;

    public String getType() {
        return this.type;
    }

    public int getPillow() {
        return this.pillow;
    }

    public int getHeight() {
        return this.height;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getQuilt() {
        return this.quilt;
    }

    public void make(){
        System.out.println("Bed --> Making | ");
    }

}
