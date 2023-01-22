import java.util.ArrayList;


import java.util.Iterator;

public class ArrayListLab {
  public static void main(String[] args) {
    ArrayList<String> student = new ArrayList<String>();
    student.add("hamid");
    student.add("robel");
    student.add("feta");
    student.add("abdu");
    System.out.println(student);
    

    // iterating array list declaration of iteraater
    Iterator<String> it = student.iterator();
    
    // to print all value in array list
    while(it.hasNext()) {
      System.out.println(it.next());
    }

    
    // to set value at some index 
    student.set(0, "tamasgane");


    //to remove value by using its index
    student.remove(0);


    //to Know the size of the are it will print the size
    System.out.println(student.size());
    
    
    // to clear the array list
    student.clear();



 }
}