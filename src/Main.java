import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        RandomNumberWriter randomNumberWriter = new RandomNumberWriter();
        RandomNumberReader randomNumberReader = new RandomNumberReader();
        System.out.println("ВВедіть назву файлу: ");
        File fileName = new File(scr.nextLine());
        System.out.println("ВВедіть мінімальне число: ");
        int minRange = Integer.parseInt(scr.nextLine());
        System.out.println("ВВедіть максимальне число: ");
        int maxRange = Integer.parseInt(scr.nextLine());
        System.out.println("ВВедіть кількість чисел , які будуть генеруватись");
        int count = Integer.parseInt(scr.nextLine());

        randomNumberWriter.userInput(minRange , maxRange);
        randomNumberWriter.numberWriter(fileName , minRange , maxRange , count);
        randomNumberReader.numberReader(fileName);
    }

}