package KavithaKuriya;


import java.util.*;

class Area {
    float f1 = 3.14f;

    public void method(double r) {
        int circle = (int) (f1 * r * r);
        System.out.println("Area of circle: " + circle);
    }

    public void method(int w, int l) {
        int rectangle = w * l;
        System.out.println("Area of rectangle: " + rectangle);
    }

    public void method(int a) {
        int area = a * a;
        System.out.println("Area of square: " + area);
    }

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the three integer numbers");
        int r = reader.nextInt(); 
        int w = reader.nextInt();
        int l = reader.nextInt();
        int a = reader.nextInt(); 
        Area ar = new Area();
        ar.method(r);
        ar.method(w, l);
        ar.method(a);
    }
}
