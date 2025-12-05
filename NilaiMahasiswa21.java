import java.util.Scanner;
public class NilaiMahasiswa21 {
    
    static void isianArray(int[] nilai) {
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i+1) + ": " + nilai[i]);
        }
    }

    static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMhs = new int[N];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("\nTotal seluruh nilai mahasiswa = " + totalNilai);

        sc.close();
    }
}
