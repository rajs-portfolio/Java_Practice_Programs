class throweg {
    void check(int a, int b) {
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Number " + sum);
        } else {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Negative Number");
            }
        }
    }
}

class try_catch_prob {
    public static void main(String args[]) {
        throweg obj = new throweg();
        obj.check(-10, 5);
    }
}