public class delete_ {
    public static void main(String args[])
    {
        StringBuffer sb= new StringBuffer("Hello ");
        sb.delete(1,3); //now original string is changed 
        System.out.println(sb);
    }    
}