import java.io.*;

public class BinaryWorker {
    public static void write(String fileName) {
        OutputStream stream = null;

        try {
            stream = new FileOutputStream(fileName);

            for (int i = 256; i < 356; i++) {
                stream.write(i);
            }

            stream.flush();

        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                }catch(IOException exception) {
                    System.out.println(exception);
                }
            }
        }
    }

    public static String read(String fileName) {
        InputStream stream = null;
        StringBuilder builder = new StringBuilder();

        try {
            stream = new FileInputStream(fileName);

            int num;

            while((num = stream.read()) != -1) {
                builder.append(num).append(" ");
            }

        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                }catch(IOException exception) {
                    System.out.println(exception);
                }
            }
        }

        return builder.toString().trim();
    }
}
