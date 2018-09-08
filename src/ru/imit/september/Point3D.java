package ru.imit.september;

public class Point3D {
    private double x,y,z;
    public Point3D(){
        x=0;
        y=0;
        z=0;
    }
    public Point3D(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void outputPoint(){
        System.out.printf("(%6.1f,%6.1f,%6.1f)",x,y,z);
    }
}
