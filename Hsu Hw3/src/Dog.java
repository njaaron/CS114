public class Dog {
    private String name;
    private double weight;
    public Dog() {
        name = "dog";
        weight = 0.0;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double toKgs(){
        double weightKg;
        weightKg = 0.453592 * weight;
        return weightKg;
    }
    public String toString(){
        String line;
        line = "The name of the dog is " + getName() + " and the weight of the dog in pounds is " + getWeight();
        return line;
    }
}
