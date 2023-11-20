import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        new PrintWriter(new FileOutputStream(FileDescriptor.out)).println("xyzzy");
    }
}
