import java.util.Scanner;
public class UnitConverter {
    public static void main(String[] args){
        int inches = 15;
        int feet;
        int remainder;
        feet = inches/12;
        remainder = inches%12;
        System.out.println(feet + " feet and " + remainder + " inches");
        double grams;
        double pounds;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grams value:");
        grams = scan.nextFloat();
        pounds = grams/453.592;
        System.out.println(pounds + " pounds");
        int milligrams;
        int kilograms;
        int gram;
        System.out.println("Enter a value of milligrams:");
        milligrams = scan.nextInt();
        kilograms = milligrams/1000000;
        milligrams = milligrams%100000;
        gram = milligrams/1000;
        milligrams = milligrams%1000;
        System.out.println(kilograms + " kilogram, " + gram + " grams, " + "and " + milligrams + " milligrams.");
    }
}
