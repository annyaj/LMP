package ru.imit.september.simpleclass;

import java.util.Scanner;
import java.util.Arrays;

public class Basic {
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
        int a,b,c;
        System.out.println("Input 3 int digits");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        System.out.println("product =" + a*b*c);
        System.out.println("average sum ="+Math.round((a+b+c)/3.0));
        int middle=0;
        int min=Math.min(Math.min(a,b),c);
        int max=Math.max(Math.max(a,b),c);
        if(a!=min && a!=max)middle=a;
        if(b!=min && b!=max)middle=b;
        if(c!=min && c!=max)middle=c;
        System.out.printf("(%2d, %2d,%2d)",min,middle,max);
        System.out.println();
    }
    public static void rootSearch(){
        double a,b,c;
        System.out.println("Input 3 double digits");
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        if(a==0){
            if(b==0)System.out.println("No solution");
            else{
                System.out.println("There is one root :" + (-c)/b);
            }
        }
        else{
            double disc=b*b - 4*a*c;
            if(disc==0)System.out.println("There is one root :" + (-b)/2*a);
            if(disc>0) {
                System.out.println("There are two roots :");
                System.out.println("X1 = " + ((-b)+Math.sqrt(disc))/2*a);
                System.out.println("X2 = " + ((-b)-Math.sqrt(disc))/2*a);
            }
            else System.out.println("All roots are complex digits");
        }
    }
    public static void tabulation(double a,double b,double step){
        double res=0;
        int j=0;
        if(step==0)System.out.println("Incorrect parameters");
        if(a<b){
            if(step<0)System.out.println("Incorrect parameters");
            else
                for(double i=a;i<b;i+=step){
                    j++;
                    res=Math.sin(i);
                    System.out.printf("%6.1f",res);
                    //System.out.print(" ");
                    //if(j==10){j=0;System.out.println();}
                }
        }
        if(a>b){
            if(step>0)System.out.println("Incorrect parameters");
            else
                for(double i=a;i<b;i+=step){
                    j++;
                    res=Math.sin(i);
                    System.out.printf("%6.3f",res);
                    //if(j==10){j=0;System.out.println();}
                }
        }
    }
    public static void solutionSystemEquat(double a1, double b1, double c1,double a2, double b2, double c2){
        double delta = a1 * b2 - a2 * b1;
        double deltaX = c1 * b2 - c2 * b1;
        double deltaY = c2 * a1 - c1 * a2;
        if(delta==0){
            if(c1==0 && c2==0){
                if(a1==0 && a2==0 && b1==0 && b2==0)System.out.print("Infinite number of roots");
                if(a1==0 && a2==0 && b1!=0 && b2!=0)System.out.print("y is any number, x=0 ");
                if(a1!=0 && a2!=0 && b1==0 && b2==0)System.out.print("x is any number, y=0 ");
                if((a1==0 && a2!=0 && b1==0 && b2!=0)|| (a1!=0 && a2==0 && b1!=0 && b2==0))
                    System.out.print("x=0 and y=0");
            }
            else if((a1==0 && b1==0 && c1==0)||(a2==0 & b2==0 & c2==0))System.out.print("No solution");
            else{
                if(deltaX!=0 && deltaY!=0)System.out.print("No solutions ");
                else if(deltaX==0 && deltaY==0){
                    if(((a1 == 0) && (b1 == 0) && (c1 != 0)) || ((a2 == 0) && (b2 == 0) && (c2 != 0)))
                        System.out.print("No solutions ");
                    if((a1 == 0 && b1 != 0 && c1 != 0) || (a2 == 0 && b2 != 0 && c2 != 0)){
                        if(b1==0)System.out.print("x is any number, y equal " + c2/b2);
                        else System.out.print("x is any number, y equal " + c1/b1);
                    }
                    if((a1 != 0 && b1 == 0 && c1 != 0) || (a2 != 0 && b2 == 0 && c2 != 0)){
                        if(a1==0)System.out.print("y is any number, x equal " + c2/a2);
                        else System.out.print("y is any number, x equal " + c1/a1);
                    }
                }
            }

        }
        else{
            System.out.print("The first root (x) is :" );
            System.out.printf("%6.1f", (deltaX/delta));
            System.out.println();
            System.out.print("The second root(y) is :");
            System.out.printf("%6.1f", (deltaY/delta));
        }
    }
    public static double decompose(double x,double precision){
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
