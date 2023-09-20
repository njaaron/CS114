import java.util.Scanner;

public class TestMethods {
    public static void main(String[] args){
        MyMethods test = new MyMethods();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a width: ");
        int width = scan.nextInt();
        System.out.println("Enter a length: ");
        int length = scan.nextInt();
        System.out.println("Enter a height: ");
        int height = scan.nextInt();
        System.out.println("The total surface area is: " + test.surface(width, length, height));

        Die d1 = new Die();
        Die d2 = new Die();
        System.out.println("Die 1 Face Value: " + d1.getFaceValue());
        System.out.println("Die 2 Face Value: " + d2.getFaceValue());
        System.out.println(test.avgFaceValues(d1, d2));
    }
}
