package ru.imit.september;

public class Main {
    public static void main(String []args){
        Basic a=new Basic();
        a.helloWorld();
        a.doubleDigits();
        a.intDigits();
        a.rootSearch();
        a.tabulation(1,6,0.5);
        a.solutionSystemEquat(0,0,0,8,8,0);
        System.out.println(a.decompose(2,0.6));
        //ArrayWork b= new ArrayWork();
        //int mass[]={2,5,4,6,0,-2};
        //b.outputToConsole(b.keyboardInput(5));
    }
}
