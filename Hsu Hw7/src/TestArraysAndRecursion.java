import java.util.*;
public class TestArraysAndRecursion {
    public static void main(String[] args){
        int[][] arr = new int[4][4];
        methods.initialize(arr);
        for(int[] x : arr){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();
        Die[][] dice = new Die[3][2];
        for(int x : methods.dieStats(dice)){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();
        methods.printDigits(23145);
        System.out.println();
        int[] a = {1,3,2,5};
        System.out.println(methods.sumArray(a,3));
        System.out.println(methods.sumArray(a,4));
    }
}
