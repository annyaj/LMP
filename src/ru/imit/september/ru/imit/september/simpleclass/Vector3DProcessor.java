package ru.imit.september.ru.imit.september.simpleclass;

import ru.imit.september.ru.imit.september.simpleclass.Vector3D;

public class Vector3DProcessor {
    public static Vector3D sum(Vector3D a, Vector3D b){
        return new Vector3D(a.getX()+b.getX(),a.getY()+b.getY(),a.getZ()+b.getZ());
    }
    public static Vector3D difference(Vector3D a,Vector3D b){
        return new Vector3D(a.getX()-b.getX(),a.getY()-b.getY(),a.getZ()-b.getZ());
    }
    public static double scalarProduct(Vector3D a,Vector3D b){
        return (a.getX()*b.getX()+a.getY()*b.getY()+a.getZ()*b.getZ());
    }
    public static Vector3D vectorProduct(Vector3D a, Vector3D b){
        return new Vector3D(a.getY()*b.getZ()-a.getZ()*b.getY(),
                a.getX()*b.getZ()-a.getZ()*b.getX(),
                a.getX()*b.getY()-a.getY()*b.getX());
    }
    public static boolean isCollinear(Vector3D a,Vector3D b){
        Vector3D mult=vectorProduct(a,b);
        return (mult.getX()==0 && mult.getY()==0 && mult.getZ()==0);
    }
}
