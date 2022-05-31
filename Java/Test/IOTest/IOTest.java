import java.io.*;

class IOTest{
  public static void main(String[] args) {
    try {
      File file = new File("File.txt");
      if (!file.exists()) {
        System.out.println("Creating a new file...");
        file.createNewFile();
      }
      PrintWriter pw = new PrintWriter(new FileWriter(file, true));
      pw.println("Line 1");
      pw.println("Line 2");
      pw.println("Line 3");
      pw.println("Line 4");
      pw.println("Line 5");
      pw.println("");

      System.out.println("Complete");
      pw.close();

    } catch (IOException e) {
      System.out.println("There was an error.");
      e.printStackTrace();
    }
  }
}