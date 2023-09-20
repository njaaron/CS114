public class methods {
    public static void initialize(int [][] arr){
        int row = arr.length;
        int column = arr[0].length;
        for(int i=0; i < row; i++){
            for(int a = 0; a < column; a++){
                if(i == a){
                    arr[i][a] = -1;
                }
                else{
                    arr[i][a] = i + a;
                }
            }
        }
    }
    public static int[] dieStats(Die[][] dice){
        int[] evenDie = new int[dice.length];
        for(int row=0; row<dice.length; row++){
            int count=0;
            for(int column=0; column<dice[row].length; column++){
                dice[row][column] = new Die();
                dice[row][column].roll();
                if(dice[row][column].get_faceValue() % 2 == 0){
                    count++;
                }
            }
            evenDie[row] = count;
        }
        return evenDie;
    }
    public static void printDigits(int num){
        if(num==0){
            return;
        }
        else{
            printDigits(num / 10);
        }
        System.out.println(num % 10);
    }
    public static int sumArray(int[] numArray,int numbersToAdd){
        if(numbersToAdd<=0){
            return 0;
        }
        else{
            return sumArray(numArray,numbersToAdd-1) + numArray[numbersToAdd-1];
        }
    }
}
