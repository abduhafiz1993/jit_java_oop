abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void ani();
    // Regular method
    public void property() {
      System.out.println("Zzz");
    }
  }
  
  // Subclass (inherit from Animal)
  class Pig extends Animal {
    public void ani() {
      // The body of animalSound() is provided here
      System.out.println("The pig says are dirty");
    }
  }
  interface Animals {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
  }
  class Pigs implements Animals {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      System.out.println("Zzz");
    }
  }
  // interface inheritance
  interface Human {
    public void myMethod(); // interface method
  }
  
  interface Monkeys {
    public void myOtherMethod(); // interface method
  }
  
  class DemoClass implements Human, Monkeys {
    public void myMethod() {
      System.out.println("Operation of my method");
    }
    public void myOtherMethod() {
      System.out.println("Operation of my other method");
    }
  }
  
 
    class Quiz{
    public static void main(String[] args) {
     //this the abstract class part
      Pig myPig = new Pig(); // Create a Pig object
      myPig.ani();
      myPig.property();
      //this is interface part
      Pigs theP = new Pigs();
      theP.animalSound();
      theP.sleep();
      // interface 
      DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
    }
}

