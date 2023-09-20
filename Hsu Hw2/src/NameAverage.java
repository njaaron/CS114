import java.util.Scanner;
public class NameAverage {
    public static void main(String[] args){
        String nameOne;
        String nameTwo;
        String nameThree;
        String nameFour;
        String nameInitials;
        double total;
        double averageLength;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the first student: ");
        nameOne = scan.next();
        System.out.println("Enter the name of the second student: ");
        nameTwo = scan.next();
        System.out.println("Enter the name of the third student: ");
        nameThree = scan.next();
        System.out.println("Enter the name of the fourth student: ");
        nameFour = scan.next();
        total = nameOne.length() + nameTwo.length() + nameThree.length() + nameFour.length();
        averageLength = total/4.0;
        nameInitials = nameOne.substring(0,1) + nameTwo.substring(0,1) + nameThree.substring(0,1) + nameFour.substring(0,1);
        System.out.println("The average name length of the four students is " + averageLength + " and the initials are " + nameInitials);


    }
}
