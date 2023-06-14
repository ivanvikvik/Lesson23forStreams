import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
//        OutputStream
//        InputStream
        String fileName = "d:\\vikvik\\numbers.bin";
        String textFileName = "d:\\vikvik\\characters.xxx";

//        BinaryWorker.write(fileName);
//        System.out.println(BinaryWorker.read(fileName));

        CharacterWorker.write(textFileName);
        System.out.println(CharacterWorker.read(textFileName));

//        Writer
//        Reader
    }


}