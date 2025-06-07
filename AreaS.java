import java.util.Scanner;

public class AreaS {

    // Area of Square
    public double area(double side) {
        return side * side;
    }

    // Area of Circle
    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    // Area of Triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of Rectangle
    public double area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        // Square
        System.out.print("Enter side of square: ");
        double squareSide = scanner.nextDouble();
        System.out.println("Area of Square: " + shape.area(squareSide));

        // Circle
        System.out.print("Enter radius of circle: ");
        float circleRadius = scanner.nextFloat();
        System.out.println("Area of Circle: " + shape.area(circleRadius));

        // Triangle
        System.out.print("Enter base of triangle: ");
        double triangleBase = scanner.nextDouble();

        System.out.print("Enter height of triangle: ");
        double triangleHeight = scanner.nextDouble();
        
        System.out.println("Area of Triangle: " + shape.area(triangleBase, triangleHeight));

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        int rectangleLength = scanner.nextInt();

        System.out.print("Enter width of rectangle: ");
        int rectangleWidth = scanner.nextInt();

        System.out.println("Area of Rectangle: " + shape.area(rectangleLength, rectangleWidth));

        scanner.close();
    }
}
