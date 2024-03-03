import java.io.FileWriter;
import java.io.IOException;

public class TextToFile {

    public static void buatFile(String text, String lokasiFile) {
        try (FileWriter fw = new FileWriter(lokasiFile)) {
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
