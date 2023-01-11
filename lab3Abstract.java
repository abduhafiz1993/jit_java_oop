abstract class AbstractClass { 
String name;
int num;

AbstractClass(String name, int num) { 
this.name =name;
this.num = num;
}

// abstract method no body
abstract int abstractMethod();

void getAbstractClassfields(){ 
System.out.println("AbstractClass field");
System.out.println("String-feild : " + name + " intger-field : " + num);
}
}

class InheritAbstractClass extends AbstractClass {
double floatnum;
public InheritAbstractClass(String name, int num, double floatnum){
super(name, num); 
setDoubleFeild(floatnum);
}

public int abstractMethod(){
    return num;// this return num in the super class
}

double getDoubleFeild() { 
return floatnum;
}
void setDoubleFeild(double newFloatnum) { 
if(newFloatnum >= 0.0) {
floatnum = newFloatnum;
}
}
}


public class lab3Abstract {
public static void main(String [] args) {
InheritAbstractClass sal = new InheritAbstractClass("Adenagir", 4, 600.90); 
sal.getAbstractClassfields();
sal.getDoubleFeild();
sal.abstractMethod();

}
}
