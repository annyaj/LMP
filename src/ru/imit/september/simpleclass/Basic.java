package ru.imit.september.simpleclass;

import java.util.Scanner;
import java.util.Arrays;

public class Basic {
    public class Solution extends Throwable{
        public Solution(){}
        public Solution(String message){
            super(message);
        }
    }
    public static void helloWorld(){
        System.out.print("Hello,World");
    }
    public static void workWithDoubleDigits(){
        double[] arr=new double[3];
        System.out.println("Input 3 double digits");
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextDouble();
        }
        System.out.println("product =" + arr[0]*arr[1]*arr[2]);
        System.out.println("average sum ="+ (arr[0]+arr[1]+arr[2])/3.0);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void workWithIntDigits(){
        int[] arr=new int[3];
        System.out.println("Input 3 integer digits");
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("product =" + arr[0]*arr[1]*arr[2]);
        System.out.println("average sum ="+Math.round((arr[0]+arr[1]+arr[2])/3.0));
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static double[] rootSearch(double a,double b,double c){
        double[] rootArray = null;
        if (a == 0){
            if(b == 0) {
                if (c == 0)
                {
                    return null;
                }
                else return new double[0];
            }
            else{
                rootArray = new double [1];
                rootArray[0] = (-c) / b ;
            }
        }
        else{
            double disc=b*b - 4*a*c;
            if(disc == 0) {
                rootArray = new double[1];
                rootArray[0] = (-b)/(2*a);
            }
            else if(disc > 0) {
                rootArray = new double[2];
                rootArray[0] = ((-b)+Math.sqrt(disc))/(2*a);
                rootArray[1] = ((-b)-Math.sqrt(disc))/(2*a);
            }
            else { return new double[0];}
        }
        return rootArray;
    }
    public static void tabulation(double a,double b,double step){
        double res;
        if(step==0)System.out.println("Incorrect parameters");
        if(a<b){
            if(step<0)System.out.println("Incorrect parameters");
            else
                for(double i=a;i<b;i+=step){
                    res=Math.sin(i);
                    System.out.printf("%6.1f",res);

                }
        }
        if(a>b){
            if(step>0)System.out.println("Incorrect parameters");
            else
                for(double i=a;i<b;i+=step){
                    res=Math.sin(i);
                    System.out.printf("%6.3f",res);
                }
        }
    }
    public static double[] solutionSystemEquations(double a1, double b1, double c1,double a2, double b2, double c2){
        double delta = a1 * b2 - a2 * b1;
        double deltaX = c1 * b2 - c2 * b1;
        double deltaY = c2 * a1 - c1 * a2;
        double[] rootArray = null;
        if(delta==0){
            if(c1==0 && c2==0){
                if(a1==0 && a2==0 && b1==0 && b2==0)return null;
                else if(a1==0 && a2==0 && b1!=0 && b2!=0 || a1!=0 && a2!=0 && b1==0 && b2==0){
                    rootArray = new double[1];
                    rootArray[0] = 0;
                }
                else if((a1==0 && a2!=0 && b1==0 && b2!=0)|| (a1!=0 && a2==0 && b1!=0 && b2==0)){
                    rootArray = new double[2];
                    rootArray[0] = 0;
                    rootArray[1] = 0;
                }
            }
            else if((a1==0 && b1==0 && c1==0)||(a2==0 & b2==0 & c2==0))return null;
            else{
                if(deltaX!=0 && deltaY!=0){return new double[0];}
                else if(deltaX==0 && deltaY==0){
                    if(((a1 == 0) && (b1 == 0) && (c1 != 0)) || ((a2 == 0) && (b2 == 0) && (c2 != 0))) {
                        return new double[0];
                    }
                    else if((a1 == 0 && b1 != 0 && c1 != 0) || (a2 == 0 && b2 != 0 && c2 != 0)){
                        if(b1==0){
                            rootArray = new double[1];
                            rootArray[0] = c2/b2;
                        }
                        else {
                            rootArray = new double[1];
                            rootArray[0] = c1/b1;
                        }
                    }
                    else if((a1 != 0 && b1 == 0 && c1 != 0) || (a2 != 0 && b2 == 0 && c2 != 0)){
                        if(a1==0){
                            rootArray = new double[1];
                            rootArray[0] = c2/b2;
                        }
                        else {
                            rootArray = new double[1];
                            rootArray[0] = c1/b1;
                        }
                    }
                }
            }

        }
        else{
            rootArray = new double[2];
            rootArray[0] = deltaX/delta;
            rootArray[1]=deltaY/delta;
        }
        return rootArray;
    }
    public static double decomposeExp(double x,double precision){
        int num=1;
        double next=1,sum=1;
        while(Math.abs(next)>= precision) {
            next *= (x / num);
            sum += next;
            num++;
        }
        return sum;
    }
}
