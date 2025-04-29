class finally_ {
    public static void main(String[] args) {
        int x = 12;
        int y = 2;

        try {
            int z = x / y;
            System.out.println("Result is: " + z);
        } catch (Exception e) {
          

     System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
