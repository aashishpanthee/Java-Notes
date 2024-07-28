import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
  public static void main(String[] args) throws IOException {
    FileWriter fileWriter = new FileWriter(new File("File_I/O", "abc.txt"), true);
    fileWriter.write("Hello World");
    fileWriter.write("\n100");
    fileWriter.write("\n");
    char[] characters = { 'a', 'b', 'c' };
    fileWriter.write(characters);
    fileWriter.flush();
    fileWriter.close();
  }
}
