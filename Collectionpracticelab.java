 //Collectionpracticela
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.LinkedList;
 import java.util.Map;
 interface Meta <I,K,L>{
     void dosomething(I []t);
     }
 public class Collectionpracticelab <T,K> {
     T x;
     int y;
     K key;
     Collectionpracticelab (T t,K k){
       this.key=k;
       this.x=t;
     }
   <Y> void displaAnyarray( Y[] anyarr){
         for (Y x:anyarr){
           System.out.println(x);
       }  }  
 
   public static void main(String[] args) {
    Collectionpracticelab<String,Integer> md1= new Collectionpracticelab<String,Integer>("ABC",101);
     Collectionpracticelab<Double,Integer> md2= new Collectionpracticelab<Double,Integer>(12.0,101);
 String[]days={"Mon","Tus","Wen"}; 
       md1.displaAnyarray(days);
       Integer [] idnum={100,101,102,103};
       md2.displaAnyarray(idnum);
         System.out.println("");
        LinkedList<String> names= new LinkedList<String>();
        names.add("Begna");
               names.add("add");
        names.add("awe");
        names.add("dsfdsf");
 
         System.out.println(names);
          Iterator<String> it= names.iterator();
  while(it.hasNext()){
      System.out.println(it.next());
  }
    Map<String,Integer> coutryarea = new HashMap<String,Integer>(); 
    coutryarea.put("ETH", 2510000);
      coutryarea.put("SOL", 5340000);
    coutryarea.put("USA", 3670000);
    coutryarea.put("DJI", 6780000);
    coutryarea.put("KEN", 1930000);
    coutryarea.put("UK", 9870000);
         System.out.println(coutryarea.keySet());
                 System.out.println(coutryarea.values());
 
        }
     }