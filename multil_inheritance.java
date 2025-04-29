class a {
    int a = 50;
}

class b extends a {
    int b = a * a;
}

class c extends b {
    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class multil_inheritance {
    public static void main(String args[]) {
        c ob = new c();
        ob.display();
    }
}
