import java.util.Scanner;
public class Kennel {
    public static void main(String[] args){
        String name;
        double weight;
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the first dog: ");
        name = scan.nextLine();
        System.out.println("Enter the weight of the first dog: ");
        weight = scan.nextDouble();
        scan.nextLine();
        dog1.setName(name);
        dog1.setWeight(weight);
        System.out.println("Enter the name of the second dog: ");
        name = scan.nextLine();
        System.out.println("Enter the weight of the second dog: ");
        weight = scan.nextDouble();
        dog2.setName(name);
        dog2.setWeight(weight);
        System.out.println(dog1.toString() + " and " + dog1.toKgs() + " kgs");
        System.out.println(dog2.toString() + " and " + dog2.toKgs() + " kgs");
    }
}
