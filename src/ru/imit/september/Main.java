package ru.imit.september;

public class Main {
    public static void main(String []args){
       /* Basic a=new Basic();
        double answ = a.decompose(2,0.6);
       System.out.println(answ);
        ArrayWork a= new ArrayWork();
        int arr[]= a.keyboardInput(5);
       a.outputToConsole(arr);
       int sum= a.quantInclNumb(arr,9,5);
        boolean fl=a.isPositive(arr);
       if(fl==true)System.out.print("Yes");
       else System.out.print("No");

       int arr2[]=a.reverseArray(arr);
       a.outputToConsole(arr2);
       */
       Vector3D a= new Vector3D(4,5,3);
       Vector3D b= new Vector3D(4,5,3);
       if(a.isEqual(b)==true) System.out.print("Yes");
       System.out.print(a.length());


    }
}
