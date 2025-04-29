package P1;

public class xyz {
    public void display() {
        abc ob = new abc(); // Create an instance of the abc class
        System.out.println(ob.a); // default access, accessible in the same package
        System.out.println(ob.b); // public access, accessible everywhere
        // System.out.println(ob.c); // private access, accessible in the same package
        // and subclasses
        System.out.println(ob.d); // protected access, accessible in the same package and subclasses
    }
}
