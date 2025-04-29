class A {
    int a=10;
}
class B extends A {
    int a=20;
    void display() {
        System.out.println("a = " + a); // prints 20
        System.out.println("a = " + super.a); // prints 10
    }
}
class variable_overriding {
    public static void main(String args[]) {
        B ob = new B();
        ob.display();
    }
}
