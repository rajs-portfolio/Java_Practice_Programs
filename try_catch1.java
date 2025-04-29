class try_catch1 {
    public static void main(String[] args) {
        int x = 12;
        int y = 2;
        try {
            int z = x / y;
            System.out.println("Result: " + z);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}