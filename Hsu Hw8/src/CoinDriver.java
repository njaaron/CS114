import java.util.Random;
public class CoinDriver {
    public static void main(String[] args){
        Random r = new Random();
        int tails = 0;
        int total = 0;
        Coin[] coins = new MonetaryCoin[20];
        for(int i = 0; i < 20; i++){
            coins[i] = new MonetaryCoin(r.nextInt(20)+1);
        }
        for(int i = 0; i < coins.length; i++){
            if(!coins[i].isHeads()){
                total += ((MonetaryCoin) coins[i]).getValueCents();
                tails++;
            }
        }
        System.out.println("The highest monetary value of all the coins with tail face is " + total);

    }
}
