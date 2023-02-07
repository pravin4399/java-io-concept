import java.io.*;

public class BufferedInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream fileInputStream = new FileInputStream("C:\\Users\\pravi\\IdeaProjects\\java-io-concept\\java-io-byte-streaming\\src\\input.text");

        BufferedInputStream bufferedInputOutputStream = new BufferedInputStream(fileInputStream);

        System.out.println(bufferedInputOutputStream.available());
        byte[] bytes = bufferedInputOutputStream.readAllBytes();
        System.out.println(new String(bytes));

       OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\pravi\\IdeaProjects\\java-io-concept\\java-io-byte-streaming\\src\\output.text");


        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write(bytes);

    }

    }
