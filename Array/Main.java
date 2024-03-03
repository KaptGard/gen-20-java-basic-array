import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) {

        String lokasiFile = "test.txt";
        String konten = InputOutput.bacaFile(lokasiFile);
        System.out.println("Isi dari file " + lokasiFile + " adalah:\n" + konten);

        String textInput = "INI CUMA CONTOH.";
        String outputFilePath = "output.txt";
        TextToFile.buatFile(textInput, outputFilePath);
        System.out.println("File" + outputFilePath + " berhasil dibuat.");

        int[][] nomor = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        Array manipulator = new Array(nomor);

        manipulator.hasilArray();

        int[] arrayBaru = manipulator.buatArrayBaru();
        System.out.println("Array baru: " + java.util.Arrays.toString(arrayBaru));

        int[][] kembaliArray = manipulator.kembalikanArray();
        System.out.println("Array yang dibalik : ");
        for (int[] subArray : kembaliArray) {
            System.out.println(java.util.Arrays.toString(subArray));
        }
    }
}

