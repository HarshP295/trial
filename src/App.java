class Cylinder{
    private float radius;
    private float height;
    public void setRadius(float radius){
        this.radius=radius;
    }
    public void setHeight(float height){
        this.height=height;
    }
    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }
    public float surfaceArea(){
        return 2*3.14f*getRadius()*(getHeight()+getRadius());
    }
    public float volume(){
        return 3.14f*getRadius()*getRadius()*getHeight();
    }
    public Cylinder(){
        this.radius=1;
        this.height=1;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder();
        c1.setRadius(5);
        c1.setHeight(10);
        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());
        System.out.println(c2.surfaceArea());
        System.out.println(c2.volume());
    }
}
