import java.util.Scanner;
public class MyMethods {
    public int surface(int width, int length, int height){
        int surfaceArea;
        surfaceArea = 2*(width*length) + 2*(length*height) + 2*(width*height);
        return surfaceArea;
    }

    public double avgFaceValues(Die die1, Die die2) {
        return (die1.getFaceValue() + die2.getFaceValue()) / 2.0;
    }

}
