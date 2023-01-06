public class Main {
    Main(){
        System.out.println("tabalhe");
    }
    static boolean isSquare(int number){
        int squrt=0;
        for(int i=1; i<number;i++){
            squrt=0;
            squrt=i*i;
            if (squrt == number){
                break;
            }

        }
        return squrt ==number;
    }
    static int concanater(int y, int nTimes){
        int sum=0, reminder;
             int  n=y;
             int  k=0;
        while(n>0){
            reminder= n%10;
            for(int i =nTimes-1 ; i>=0;i--){
                sum += reminder*(10^i);
                System.out.println(10^2);

            }
            n /=10;
        }
         if(sum == y){
             k=1;
         }
         else{
             k=0;
         }
         return k;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(concanater(198,3));
        Main ne =new Main();
        
    }
}