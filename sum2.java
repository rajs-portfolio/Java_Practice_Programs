class test1 {
    int a, b, sum;

    void input() {
        a = 10;
        b = 20;
        sum = 0;
    }

    void disp() {
        sum = a + b;
        System.out.println("the sum is " + sum);
    }
}

class sum2 {
    public static void main(String args[]) {
        test1 ob = new test1();
        ob.input();
        ob.disp();
    }
}
