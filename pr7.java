import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pr7 {
    File readinfile = new File("pr7.txt");
    int readFileme(String line, File file) {
        if (readInFile.exists()) {
            return line.length();
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        String str = "File Handling in Java using "+" FileWriter and FileReader";
        FileWriter writeInFile = new FileWriter("pr7.txt");
        for (int i = 0; i < str.length(); i++)
        {
            writeInFile.write(str.charAt(i));
        }
        System.out.println("Writing successful");
        writeInFile.close();
        int ch;
        FileReader readInFile = new FileReader("pr7.txt");
        System.out.println("File created SucessFully");
        FileReader readInFileReader = null;
        System.out.println("File is found");
        while ((ch = readInFile.read()) != -1)
            System.out.print((char) ch);
        readInFile.close();
    }
}
