import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RandomNumberReader {
    public void numberReader(File fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(" " + fileName + ".txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}