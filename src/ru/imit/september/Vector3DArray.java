package ru.imit.september;

public class Vector3DArray {
    Vector3D[] array;
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
        double x=a.getX();
        double y=a.getY();
        double z=a.getZ();
        int answ=-1;
        for(int i=0;i<array.length;i++){
            if(x==array[i].getX() &&
            y==array[i].getY()
            && z== array[i].getZ())
                answ=i;
        }
        return answ;
    }
    public Vector3D sumAllVectors(){
        Vector3DProcessor a=new Vector3DProcessor();
        Vector3D sum=array[0];
        for(int i=1;i<array.length;i++){
            sum=a.sum(sum,array[i]);
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

}
