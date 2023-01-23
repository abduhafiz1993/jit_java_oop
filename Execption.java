public class Execption {
    public static void main(String[ ] args) {
        // exception if it is right execute bellow  
        try {
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
        } catch (Exception e) {
          System.out.println("Something went wrong.");
        }
      }
}
