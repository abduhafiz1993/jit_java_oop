import java.io.File;  // import the File class
import java.io.IOException;  // import the IOException class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Files {
  public static void main(String[] args) {
    try {
      // this line of code use for creating file
      File Obj = new File("filename.txt");
      if (Obj.createNewFile()) {
        // this line to print file name
        System.out.println("File created: " + Obj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }

    // writting on file
    try {
      // declaring writer object
      FileWriter writerToFile = new FileWriter("filename.txt");
      writerToFile.write("My name is abdulhafiz");
      writerToFile.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }

    // reading file from files 
    try {
      
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}