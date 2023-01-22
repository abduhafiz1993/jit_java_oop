import java.util.HashMap;

public class HashMapLab {
  public static void main(String[] args) {
    // Create a HashMap object called numberWithColor
    HashMap<Integer, String> numberWithColor = new HashMap<Integer, String>();

    // Add keys and values (Country, City)
    numberWithColor.put(1, "red");
    numberWithColor.put(2, "Blue");
    numberWithColor.put(3, "green");
    numberWithColor.put(4, "yellow");
    System.out.println(numberWithColor);

    // print the value of key
    System.out.println(numberWithColor.get(1));

    //// Print keys and values
for (Integer i : (numberWithColor.keySet())) {
    System.out.println("key: " + i + " value: " + (numberWithColor.get(i)));
  }
}
}

