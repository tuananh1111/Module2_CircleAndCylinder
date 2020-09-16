public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(5.0,"Blue");
        System.out.println(circle.toString());
        Circle cylinder= new Cylinder(5.5,"Green",10);
        System.out.println(cylinder.toString());
    }
}
