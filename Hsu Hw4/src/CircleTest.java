import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args){
        Point pointOne = new Point((int)((Math.random() * (26-1)) + 1), (int)((Math.random() * (26-1)) + 1));
        Point pointTwo = new Point(0,0);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = scan.nextInt();
        Circle circleOne = new Circle(pointTwo, radius);
        System.out.println("The summary for circle one is: ");
        System.out.println("Radius: " + circleOne.getRadius() + ", Center: " + circleOne.getCenter());
        System.out.println("Area: " + circleOne.area());
        System.out.println();
        Circle circleTwo = new Circle(pointOne, 10);
        System.out.println("The summary for circle two is: ");
        System.out.println("Radius: " + circleTwo.getRadius() + ", Center: " + circleTwo.getCenter());
        System.out.println("Area: " + circleTwo.area());
        System.out.println("The distance between the centers is: " + circleOne.getCenter().distance(circleTwo.getCenter()));
    }
}
