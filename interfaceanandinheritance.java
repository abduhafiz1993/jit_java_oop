class SuperClass{
    SuperClass(){
        System.out.println("I am super class");
    }
    void SuperClassMethod(){
        System.out.println("Am a super class method");
    }
    final void notOverridedMethod(){
    System.out.println("I have final no one not override me");
    }
}
class SubClass extends SuperClass{
    SubClass(){
        System.out.println("I am sub class");
     }
    void SuperClassMethod(){
        System.out.println("am overrriding from my superclass");
        super.SuperClassMethod();
    }
    // i can invoke the method that overrided
    
}
abstract class AbstractClass{
    // abstract calss have a constractur  but there is no abstract class
    AbstractClass(){
        System.out.println("why do u invoke an abstract class");
    }
    // abstract can have amethod with defination
    void AbstractMethodWithDefination(){
        System.out.println("Am abstract method with defination");
    }
    abstract void AbstractMethod();
    abstract void AbstractMethod1();
    abstract void AbstractMethod2();


}
class InheritAbstractClass extends AbstractClass{
    InheritAbstractClass(){
        System.out.println("Am In herit a abstract class");
    }
    public void AbstractMethod(){
        System.out.println("Am abstract method 1");
    }
    
    public void AbstractMethod1(){
        System.out.println("Am abstract method 2");
    }
    
    public void AbstractMethod2(){
        System.out.println("Am abstract method 3");
    }
    
    public void classMethod(){
        System.out.println("Am not inherit class");
    }
}

public class interfaceanandinheritance {
    public static void main (String[] arg){
         // to invoke the super make object for sub class
         SubClass obj1 = new SubClass();
         obj1.SuperClassMethod();
    
        }
    
    }
