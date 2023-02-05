import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("C://Users//pravi//IdeaProjects//java-io-concept//java-io-byte-streaming//src//input.text");
            System.out.println(inputStream.available());
            OutputStream outputStream = new FileOutputStream("C://Users//pravi//IdeaProjects//java-io-concept//java-io-byte-streaming//src//output.text");
            
            outputStream.write(inputStream.readAllBytes());

            inputStream.close();


        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
