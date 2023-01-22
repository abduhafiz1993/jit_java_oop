import java.util.LinkedList;

import java.util.Iterator;


public class LinkedListLAb {
  public static void main(String[] args) {
    LinkedList<Integer> studentId = new LinkedList<Integer>();
    studentId.add(5568);
    studentId.add(4356);
    studentId.add(3456);
    studentId.add(0206);
    System.out.println(studentId);



    //Adds an item to the beginning of the list.
    studentId.addFirst(2367);
    
    
    //Add an item to the end of the list
    studentId.addLast(4536); 	
    
    
    //Remove an item from the beginning of the list.
    studentId.removeFirst();		
    

    //Remove an item from the end of the list
    studentId.removeLast();		
    

    //Get the item at the beginning of the list
    studentId.getFirst();		
    

    //Get the item at the end of the list
    studentId.getLast();	


     // iterating linked list declaration of iteraater
     Iterator<Integer> it = studentId.iterator();
    
     // to print all value in array list
     while(it.hasNext()) {
       System.out.println(it.next());
     }
  }
}
