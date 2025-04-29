interface i1 {
    void display1();
}

interface i2 {
    void display2();
}

class inter implements i1, i2 {
    public void display1() {
        System.out.println("This is display1 method of i1 interface.");
    }

    public void display2() {
        System.out.println("This is display2 method of i2 interface.");
    }
}

class interfaces {
    public static void main(String args[]) {
        i1 obj = new inter();
        obj.display1();
        i2 obj2 = new inter();
        obj2.display2();
    }
}