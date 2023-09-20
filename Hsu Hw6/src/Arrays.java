import java.util.Scanner;
public class Arrays {
    public static int[] numberFreq(){
        int[] freq = new int[50];
        int numbers = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter an integer between 0-50 or you can enter 100 to stop: ");
            numbers = scan.nextInt();
            if (numbers != 100){
                freq[numbers - 1]++;
            }
        } while(numbers != 100);
        return freq;
    }
    public static int bigEven(int numArray[], int target){
        int count = 0;
        for(int i = 0; i < numArray.length; i++){
            if((numArray[i] > target) && (numArray[i] % 2 == 0)){
                count++;
            }
        }
        return count;
    }
    public static int oddDice(Die dices[]){
        int oddFace = 0;
        for (Die die : dices){
            die = new Die();
            die.roll();
            if(die.getFaceValue() % 2 == 1){
                oddFace++;
            }
        }
        return oddFace;
    }
}
