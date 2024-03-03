public class Array { // deklarasi kelass
    private int [] [] nomor; //dekalarasi variabel 'bilangan' yang merupakan array dua dimensi yang akan di manipulasi oleh kelas ini

    public Array(int [][] nomor) {
        this.nomor = nomor;
    }
        public void hasilArray() {
        int total = 0;
        for (int[] subArray : nomor) {
            for (int nomor : subArray) {
                total += nomor;
            }
        }
            System.out.println("Total bilangan pada array: " + total);

        }
        public int [] buatArrayBaru() {
        int [] arrayBaru = new int[nomor.length];
        for (int i = 0; i < nomor.length; i++) {
            int sum = 0;
            for (int j = 0; j < nomor[i].length; j++) {
                sum += nomor[i][j];
            }
            arrayBaru[i] = sum;
        }
        return arrayBaru;
        }

        public int[][] kembalikanArray() {
        int[][] kembaliArray = new int[nomor.length][];
        for (int i = 0; i < nomor.length; i++) {
            kembaliArray[nomor.length - 1 - i] = new int[nomor[i].length];
            for (int j = 0; j < nomor[i].length; j++) {
                kembaliArray[nomor.length - 1- i][j] = nomor[i][nomor[i].length - 1 - j];
            }
        }
        return kembaliArray;

        }
    }
