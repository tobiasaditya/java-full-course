public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width<=0 || height <=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
        //Itung area
        double area = width*height;

        //Itung butuh berapa
        int butuhBucket = (int) Math.ceil(area/areaPerBucket)-extraBuckets;
        return butuhBucket;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width<=0 || height <=0 || areaPerBucket<=0){
            return -1;
        }
        //Itung area
        double area = width*height;

        //Itung butuh berapa
        int butuhBucket = (int) Math.ceil(area/areaPerBucket);
        return butuhBucket;

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area<=0 || areaPerBucket<=0){
            return -1;
        }
        
        //Itung butuh berapa
        int butuhBucket = (int) Math.ceil(area/areaPerBucket);
        return butuhBucket;

    }
}
