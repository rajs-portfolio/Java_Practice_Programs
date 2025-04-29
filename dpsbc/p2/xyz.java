package p2;

import p1.*;

public class xyz extends abc {
    public void display() {
        // System.out.println(a); // default access, accessible in the same package
        System.out.println(b); // public access, accessible everywhere
        // System.out.println("c: " + c); // private access, accessible in the same
        // package and subclasses
        System.out.println(d); // protected access, accessible in the same package and subclasses
    }
}
