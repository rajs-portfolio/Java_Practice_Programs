class constructor1 {
    int a, b;

    constructor1(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println("The values are " + a + " " + b);
    }
}

public class constructor2 {
    public static void main(String args[]) {
        constructor1 ob = new constructor1(40, 50);
        ob.display();
    }
}
