class A {
    int i = 10;
}

class B extends A {
    void disp() {
        System.out.println(i);
    }
}

class sl_inheritance {
    public static void main(String args[]) {
        B ob = new B();
        ob.disp();
    }
}
