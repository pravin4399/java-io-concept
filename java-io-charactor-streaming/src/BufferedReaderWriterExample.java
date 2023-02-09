import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) throws IOException, IOException {
        Reader fileReader = new FileReader("C:\\Users\\pravi\\IdeaProjects\\java-io-concept\\java-io-charactor-streaming\\src\\input.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        char[] charsFromInputFile = new char[50];
        bufferedReader.read(charsFromInputFile);
        System.out.println(charsFromInputFile);//print char array to the console

        Writer fileWriter = new FileWriter("C:\\Users\\pravi\\IdeaProjects\\java-io-concept\\java-io-charactor-streaming\\src\\output.java");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(charsFromInputFile);
    }
}