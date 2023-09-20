public class TestArrays {
    public static void main(String[] args){
        int freq[] = Arrays.numberFreq();
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                System.out.printf("%-10d%-10d\n", i+1, freq[i]);
            }
        }
        int numArray[] = {2,7,8,3,4,10};
        int target = 5;
        int amount = Arrays.bigEven(numArray, target);
        System.out.println("The amount of even values and that are greater than target is: " + amount);
        Die[] dieobjects = new Die[10];
        System.out.println("The amount of dice that are odd is: " + Arrays.oddDice(dieobjects));
    }
}
