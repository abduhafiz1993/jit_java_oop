import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class collectionPractice{
    /**
     * @param arg
     */
    public static void main(String[] arg){
        // array list
        ArrayList<String> nameArr = new ArrayList<String>();
        nameArr.add("abdulhafiz");
        nameArr.set(1, "abdulhaf");
        nameArr.set(2, "abdul");

        System.out.println(nameArr.toString());
        int i = nameArr.size();
         boolean value =  nameArr.isEmpty();
         boolean contains = nameArr.contains("abdulhafiz");
         System.out.println(contains); 
         System.out.println(value);
        System.out.println(i);
        Iterator<String> it = nameArr.iterator(); 
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // linked list

        LinkedList<Integer> object1 = new LinkedList<>();
        object1.add(45);
        object1.addFirst(2);
        object1.addLast(90);
        object1.remove();
        int x = object1.get(2);
        int y = object1.getFirst();
        System.out.println(x +"\n"+y);
        
        Iterator<Integer> c = object1.iterator();
        while(!c.hasNext()){
            c.remove();
        }
        HashSet<String> n = new HashSet<String>();
        n.add("dafgav");
        n.add("dafga");   
        n.add("dafg");   
        n.add("dafgavw");
        HashMap <Integer, String> num2 = new HashMap<Integer, String>();
        num2.put(0, "abdu");
        num2.put(1, "adu");
        num2.put(2, "abu");
        num2.put(3, "abd");
        System.out.println(num2);
        num2.put(0, "abuyu");
        System.out.println(num2);
        Stack<Integer> stac = new Stack<Integer>();
        stac.push(1);
        stac.push(2);
        stac.push(4);
        stac.push(5);
        stac.pop();
        int i2 =0, ye=0;

        while(i2<stac.size()){
            y += stac.pop();
            System.out.println(ye);
            i2++;
        }
        Queue<String> hd= new LinkedList<String>();
        hd.add("akjsf/jl");
        hd.add("akjbf/jl");
        hd.add("akjbs/jl");
        hd.add("akjbsfjl");
        hd.add("akjbsf/l");
        System.out.println(hd.peek());
        hd.remove();
    }
    
}
