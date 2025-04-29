class try_catch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}