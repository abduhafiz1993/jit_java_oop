class superClass {
    int i,j;
    superClass(int a, int b) { 
    i =a;
    j =b;
    }

    // not overrdien

    final void notOverrdien(){
        System.out.println("A method not overriden");
    }
    void sum(){ // display i and j
    System.out.println("i and j: " + i + " " + j);
    }
    }
    class subClass extends superClass{ 
    int k;
    subClass(int a, int b, int c){
    super(a,b); 
    k =c;
    }
    // overriding 
    void sum() {
    System.out.println("sum: " +(super.i + super.j + k));
    }
    }

    // 
    final class notOverrdienClass{
    notOverrdienClass(){
            System.out.println("Not Overrdien Class");
        }

    }
    class lab2lnpoly {
        public static void main(String args[]) { 
        subClass subOb = new subClass(1, 2, 3); 
        subOb.sum();

        }
    }