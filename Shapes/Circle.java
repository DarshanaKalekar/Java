import java.util.Scanner;

public class Circle extends Shape{
    int radius;
    floate PI = 3.14;
    double area(int radius){
        double area = PI * this.radius * this.radius;
        return area;
    }

    double circumference(int radius){
        double circumference = 2 * PI * this.radius;
        return circumference;
    }

    void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        this.radius = sc.nextInt();
    }

    void print(){
        System.out.println("Area of circle with radius " + this.radius + " is " + area(radius) + " and its circumference is " + circumference(radius));
    }
}
