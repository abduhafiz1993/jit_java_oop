public class interfacepractice {
    public static void main(String[] arg ){
        Impleneter name = new Impleneter();
        name.interfaceMethod1();
        name.interfaceMethod2();
        name.interfaceMethod3();
        Impleneter2 name2 = new Impleneter2();
        name2.interface2Method1();
        name2.interface2Method2();
        name2.interface2Method3();
        name2.interfaceMethod1();
        name2.interfaceMethod2();
        name2.interfaceMethod3();
        
    }
}
interface INerface{
    final static int c = 0;
    void interfaceMethod1();
    void interfaceMethod2();
    void interfaceMethod3();
}
interface INerface2  extends INerface, INerface3{
    void interface2Method1();
    void interface2Method2();
    void interface2Method3();
}
interface INerface3{
    void interfaceMethod1();
    void interfaceMethod2();
    void interfaceMethod3();
}

class Impleneter implements INerface{
    
    
    @Override
    
    public void interfaceMethod1(){
        System.out.println("Am override interface");
    }
    
    public void interfaceMethod2(){
        System.out.println("Am override interface method 2");
    }
    public void interfaceMethod3(){
        System.out.println("Am override interface method 3");

    }

}
class Impleneter2 implements INerface2{
    
    
    @Override
    
    public void interfaceMethod1(){
        System.out.println("Am override interface");
    }
    
    public void interfaceMethod2(){
        System.out.println("Am override interface method 2");
    }
    public void interfaceMethod3(){
        System.out.println("Am override interface method 3");

    }
    // override part of second inerface
    public void interface2Method1(){
        System.out.println("Am override interface");
    }
    
    public void interface2Method2(){
        System.out.println("Am override interface method 2");
    }
    public void interface2Method3(){
        System.out.println("Am override interface method 3");

    }


}
