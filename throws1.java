import java.io.*;

class throws1 {
    public static void main(String args[]) throws IOException {
        DataInputStream ds = new DataInputStream(System.in);
        System.out.println("Enter 3 nos");
        int a = Integer.parseInt(ds.readLine());
        float b = Float.parseFloat(ds.readLine());
        double c = Double.parseDouble(ds.readLine());

        System.out.println("Enter a string");
        String ch = ds.readLine();
        System.out.println("string " + ch);
        System.out.println("3 nos= " + a + " " + b + " " + c);
    }
}
