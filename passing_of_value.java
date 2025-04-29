class test1 {
    int a, b, sum;

    void input(int x, int y) {
        a = x;
        b = y;
        sum = a + b;
    }

    void disp() {
        System.out.println("The sum is " + sum);
    }
}

class passing_of_value {
    public static void main(String args[]) {
        test1 ob = new test1();
        ob.input(10, 20);
        ob.disp();
    }
}
