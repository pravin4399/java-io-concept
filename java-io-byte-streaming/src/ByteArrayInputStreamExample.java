import java.io.*;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        try {
            byte[] byteArray = {'H', 'E', 'L', 'L', 'O'};
            InputStream inputStream = new ByteArrayInputStream(byteArray, 0, byteArray.length);

            OutputStream outputStream = new ByteArrayOutputStream();
            outputStream.write(inputStream.readAllBytes());
            System.out.println(outputStream);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}