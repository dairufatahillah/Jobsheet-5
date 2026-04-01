package minggu5;

public class DaftarNilaiMahasiswa {
    public static int cariMaxDC(int[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        
        int tengah = (kiri + kanan) / 2;
        int maxKiri = cariMaxDC(arr, kiri, tengah);
        int maxKanan = cariMaxDC(arr, tengah + 1, kanan);
        
        return Math.max(maxKiri, maxKanan);
    }

    public static int cariMinDC(int[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        
        int tengah = (kiri + kanan) / 2;
        int minKiri = cariMinDC(arr, kiri, tengah);
        int minKanan = cariMinDC(arr, tengah + 1, kanan);
        
        return Math.min(minKiri, minKanan);
    }

    public static double hitungRataRataBF(int[] arr) {
        double total = 0;
        
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        
        return total / arr.length;
    }

    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        int maxUTS = cariMaxDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("a) Nilai UTS tertinggi (Divide and Conquer) : " + maxUTS);

        int minUTS = cariMinDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("b) Nilai UTS terendah (Divide and Conquer)  : " + minUTS);

        double rataRataUAS = hitungRataRataBF(nilaiUAS);
        System.out.println("c) Rata-rata nilai UAS (Brute Force)        : " + rataRataUAS);
    }
}
