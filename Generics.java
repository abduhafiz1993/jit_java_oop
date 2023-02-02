public class Generics<Z, X, V> {
    Z z;
    X x;
    V v;
    /**
     * @param z
     * @param x
     * @param v
     */
    Generics(Z z, X x,V v){
        this.v=v;
        this.x=x;
        this.v=v;
    }

    <R> void printSumOfElements(R ...args){
        for(R y : args){
            System.out.println(y);
        
        }

    }

    /**
     * @param arg
     */
    public static void main(String[] arg){
        Generics<Integer, Double, String> obh= new Generics<Integer,Double,String>(4, 4.5, "abdulhfiz");
        System.out.println(obh.v);
        System.out.println(obh.x);
        System.out.println(obh.z);
        obh.printSumOfElements(1,2,3,3,4);

    }
}
