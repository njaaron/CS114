import java.util.Scanner;
public class MainThrow {
    public static void main(String[] args) throws BonusTooLowException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of executives: ");
        int num = scan.nextInt();
        scan.nextLine();
        Executive[] arr = new Executive[num];
        for(int i = 0; i < num; i++){
            System.out.println("Name: ");
            String eName = scan.nextLine();
            System.out.println("Address: ");
            String eAddress = scan.nextLine();
            System.out.println("Phone: ");
            String ePhone = scan.nextLine();
            System.out.println("SSN: ");
            String socSecNumber = scan.nextLine();
            System.out.println("Rate: ");
            double rate = scan.nextDouble();
            System.out.println("Bonus: ");
            double bonus = scan.nextDouble();
            if(bonus < 2000){
                throw new BonusTooLowException("Bonus is less than 2000");
            }
            arr[i] = new Executive(eName, eAddress, ePhone, socSecNumber, rate);
        }
    }
}
