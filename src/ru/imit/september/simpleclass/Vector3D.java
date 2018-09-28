package ru.imit.september.simpleclass;

import java.util.Objects;

public class Vector3D {
    private double x,y,z;
    public Vector3D(){
        x=0;
        y=0;
        z=0;
    }
    public Vector3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Vector3D(Point3D a, Point3D b){
        x=a.getX()-b.getX();
        y=a.getY()-b.getY();
        z=a.getZ()-b.getZ();
    }
    public double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    public boolean isEqualVectors(Vector3D a){
        return (x==a.getX() && y==a.getY() && z==a.getZ());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Double.compare(vector3D.x, x) == 0 &&
                Double.compare(vector3D.y, y) == 0 &&
                Double.compare(vector3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
