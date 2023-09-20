public class MonetaryCoin extends Coin{
    private int valueCents;
    public MonetaryCoin(int valueCents){
        super();
        this.valueCents = valueCents;
    }
    public int getValueCents(){
        return valueCents;
    }
    public void setValueCents(int valueCents){
        this.valueCents = valueCents;
    }
    public String toString(){
        String faceName;
        if(isHeads()){
            faceName = "Heads";
        }else{
            faceName = "Tails";
        }
        return "The current face of the coin is " + faceName + " and the value of the coin is " + valueCents;
    }
}
