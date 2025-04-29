public class ends_with {
   public static void main(String args[])
   {
    String str= new String("This is realy not immutable");
    boolean retVal;
    retVal= str.endsWith("Immutable");
    System.out.println("Returned value= " + retVal);
    retVal = str.endsWith("immu");
    System.out.println("returned value= "+ retVal);
   } 
}
