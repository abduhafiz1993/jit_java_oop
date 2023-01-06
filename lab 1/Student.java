public class Student {
    private String name;
    private int id;
    static String name1 = "Abdu";
    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void getter(){
        System.out.println("Name: "+this.id);
        System.out.println("Id"+this.name);
    }
    public void setter(String name, int id){
        this.name = name;
        this.id = id;
    }
    public float totalSalary(float ...salary){
        float sum =0;
        for(float i :salary){
            sum+=i;
        }
        return sum;
    }
    static void studentInfo() {
        System.out.println("This is student information center");
        System.out.println("This " + name1 + "project");
    }

}
