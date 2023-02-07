import java.io.*;

class Student implements Serializable{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IOException {

        Integer id = 100;
        String msg = "Hello Input/Output Stream";
        Student student = new Student("pravin",200);

        OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\pravi\\IdeaProjects\\java-io-concept\\java-io-byte-streaming\\src\\input.text");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(id);
        objectOutputStream.writeObject(msg);
        objectOutputStream.writeObject(student);

        InputStream fileInputStream = new FileInputStream("C:\\Users\\pravi\\IdeaProjects\\java-io-concept\\java-io-byte-streaming\\src\\input.text");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());
    }
}