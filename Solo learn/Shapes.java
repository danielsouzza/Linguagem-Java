import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
class Square extends Shape{
    Square(int x){
        width = x;
    }
    public void area(){
        System.out.println(width*width);
    }
}
class Circle extends Shape{
    Circle(int x){
        width = x;
    }
    public void area(){
        System.out.printf("%4.2f\n",(Math.PI * width * width));
    }
    
}


public class Shapes {
    public static void main(String[ ] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            Square a = new Square(x);
            Circle b = new Circle(y);
            a.area();
            b.area();
        }
    }
}