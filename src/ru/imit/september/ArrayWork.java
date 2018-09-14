package ru.imit.september;
import java.util.Scanner;
public class ArrayWork {
    public static void outputToConsole(int array[]){
        for(int i=0;i<array.length;i++)System.out.print(array[i] + " ");
    }
    public static int[] keyboardInput(int length){
        int arr[]=new int[length];
        Scanner inp=new Scanner(System.in);
        for(int i=0;i<length;i++){
            System.out.print("Input integer "+ i);
            arr[i]=inp.nextInt();
        }
        return arr;
    }
    public static int sumOfElem(int array[]){
        int sum=0;
        for(int i=0;i<array.length;i++)sum+=array[i];
        return sum;
    }
    public static int quantityEvenNumb(int array[]){
        int quantity=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0)quantity++;
        }
        return quantity;
    }
    public static int quantityIncludingNumb(int array[],double a,double b){
        int quantity=0;
        for(int i=0;i<array.length;i++){
            if(a<=b){ if(array[i]>=a && array[i]<=b)quantity++;}
            else{if(array[i]<=a && array[i]>=b)quantity++;}
        }
        return quantity;
    }
    public static boolean isPositive(int array[]){
        boolean positive=true;
        for(int i=0;i<array.length;i++){
            if(array[i]<=0)positive=false;
        }
        return positive;
    }
    public static int[] reverseArray(int array[]){
        int arr2[]=new int[array.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=array[arr2.length-i-1];
        }
        return arr2;
    }
    public static int[] shift(int array[]){
        int copy[]=new int[array.length];
        copy[0]=array[array.length-1];
        System.arraycopy(array,0,copy,1,array.length-1);
        return copy;
    }
}
