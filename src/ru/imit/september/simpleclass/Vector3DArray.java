package ru.imit.september.simpleclass;

public class Vector3DArray {
    Vector3D[] array;
    public class UnequalLengthsOfArrays extends Throwable{
        public UnequalLengthsOfArrays(){}
        public UnequalLengthsOfArrays(String message){
            super(message);
        }
    }
    public Vector3DArray(int length){
        array=new Vector3D[length];
        for(int i=0;i<length;i++)
            array[i]=new Vector3D();
    }
    public int lengthArray() {
        return array.length;
    }
    public void changeElem(Vector3D a, int index){
        array[index]=new Vector3D(a.getX(),a.getY(),a.getZ());
    }
    public int findVector(Vector3D a){
        int answ=-1;
        for(int i=0;i<array.length;i++){
            if(a.isEqualVectors(array[i])) {
                answ = i;
                break;
            }
        }
        return answ;
    }
    public Vector3D sumAllVectors(){
        Vector3D sum=array[0];
        for(int i=1;i<array.length;i++){
            sum= Vector3DProcessor.sum(sum,array[i]);
        }
        return sum;
    }
    public double maxLength(){
        double max=0;
        for(int i=0;i<array.length;i++){
            if(array[i].length()>max)
                max=array[i].length();

        }
        return max;
    }
    public Vector3D linearCombination(double[] mass)throws UnequalLengthsOfArrays{
        if(mass.length!=array.length)throw new UnequalLengthsOfArrays();
        Vector3D comb=new Vector3D();
        for(int i=0;i<mass.length;i++){
            comb=Vector3DProcessor.sum(comb,new Vector3D(array[i].getX()*mass[i],
                    array[i].getY()*mass[i],
                    array[i].getZ()*mass[i]));

        }
        return comb;
    }
    public Point3D[] arrayPoints(Point3D p){
        Point3D[] massPoints=new Point3D[array.length];
        for(int i=0;i<array.length;i++){
            massPoints[i]=new Point3D(p.getX()+array[i].getX(),
                    p.getY()+array[i].getY(),
                    p.getZ()+array[i].getZ());
        }
        return massPoints;
    }
}
