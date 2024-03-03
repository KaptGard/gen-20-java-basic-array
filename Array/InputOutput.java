import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputOutput {

    public static String bacaFile(String lokasiFile) {
        lokasiFile = "D:\\Bootcamp\\Java\\Array\\test.txt";
        StringBuilder konten = new StringBuilder();
        try (BufferedReader br = new BufferedReader((new FileReader(lokasiFile)))) {
            String line;
            while ((line = br.readLine()) != null) {
                konten.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return konten.toString();
    }
}

