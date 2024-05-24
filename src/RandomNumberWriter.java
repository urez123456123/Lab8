import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberWriter {
    public void userInput(int minRange, int maxRange) {
        if (minRange >= maxRange) {
            System.out.println("Помилка: мінімальний діапазон має бути меншим за максимальний");
        }
    }

    public void numberWriter(File fileName, int minRange, int maxRange, int count) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("M:\\PTC\\" + fileName + ".txt"));
            writer.write("Ваше мінімальне значення: " + minRange + " .Ваше максимальне значення: " + maxRange + "\n");

            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                writer.write(randomNumber + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}