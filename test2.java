class test1 {
    int a, b;

    void input() {
        a = 10;
        b = 20;
    }

    void disp() {
        System.out.println("The values are a=" + a + " b=" + b);
    }
}

class test2 {
    public static void main(String args[]) {
        test1 ob = new test1();
        ob.input();
        ob.disp();
    }
}
