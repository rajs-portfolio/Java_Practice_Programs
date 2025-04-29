interface A {
    void disp();
}

class lambda_expression {
    public static void main(String[] args) {
        A obj = () -> {   //this is a lambda expression
            System.out.println("This is implementation using lambda expression.");
        };
        obj.disp();
    }
}
