import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {

        Reader fileReader = new FileReader("C:\\Users\\pravi\\IdeaProjects" +
                "\\java-io-concepts\\java-io-character-streaming\\src\\" +
                "input.txt");

        System.out.println(fileReader.ready());

        int size = 50;
        char[] charsFromFile = new char[size];
        fileReader.read(charsFromFile);

        System.out.println(charsFromFile);//print on the console

        FileWriter fileWriter = new FileWriter("C:\\Users\\pravi\\IdeaProjects" +
                "\\java-io-concepts\\java-io-character-streaming\\src\\" +
                "output.txt");
        fileWriter.write(charsFromFile);
    }
}
