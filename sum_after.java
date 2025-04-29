class sum_after {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        try 
        {
            Thread.sleep(10000); // Wait for 10 seconds
        } catch (InterruptedException e) 
        {}
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}
