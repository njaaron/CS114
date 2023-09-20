import java.util.Scanner;
public class NameApp {
    public static void main(String[] args){
        String firstName;
        String lastName;
        String username;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = scan.next();
        System.out.println("Enter your last name: ");
        lastName = scan.next();
        int randomNumber = 1 + (int)(Math.random() * 50);
        username = lastName.substring(0,1) + firstName.substring(0,3) + randomNumber;
        System.out.println("Your username is: "+ username);
    }
}
