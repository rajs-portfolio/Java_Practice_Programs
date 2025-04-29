class a {
    int x = 10;
    int y = 5;
}

class b extends a {
    void add() {
        int sum = x + y;
        System.out.println("Addition = " + sum);
    }
}

class c extends a {
    void multiply() {
        int product = x * y;
        System.out.println("Multiplication = " + product);
    }
}

public class H_inheritance {
    public static void main(String[] args) {
        b objB = new b();
        objB.add();

        c objC = new c();
        objC.multiply();
    }
}
