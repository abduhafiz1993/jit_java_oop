import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;


public class filepractice{

    private static final Object Pig = null;

    public static void main (String[] arg) throws IOException, ClassNotFoundException{
        PrintWriter outfile = new PrintWriter( new FileOutputStream("text.txt", false));
        int y=0;
        outfile.print("abdulhafiz");
        outfile.println(y);

        outfile.close();
        PrintWriter outfile2 = new PrintWriter( new FileOutputStream("text.txt", true));
        int y1=0;
        outfile2.print("abdulhafiz");
        outfile2.print(y1);

        outfile2.close();

        BufferedReader  in = new BufferedReader(new FileReader("text.txt"));
        String line = in.readLine(); 
        System.out.println(line);
        in.close();

        ObjectOutputStream outob = new ObjectOutputStream(new FileOutputStream("text.txt", true));
        outob.writeObject(Pig);
        outob.close();

        ObjectInputStream inob = new ObjectInputStream(new FileInputStream("text.txt"));
        Object pigs = inob.readObject();
        inob.close();



    }
}
