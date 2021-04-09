public class Cuboid extends Rectangle {
    private double height;
    public Cuboid(double width, double length,double height) {
        super(width, length);
        //TODO Auto-generated constructor stub
        if(height<0){
            this.height=0;
        }
        else{
            this.height=height;
        }

    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }
}
