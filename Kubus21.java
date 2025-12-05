import java.util.Scanner;
public class Kubus21 {
     
    static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }

    static int hitungLuasPermukaan(int sisi) {
        return 6*sisi*sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int sisi = sc.nextInt();

        int volume = hitungVolume(sisi);
        int LuasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("\nVolume kubus: "+volume);
        System.out.println("Luas permukaan kubus: "+LuasPermukaan);
        sc.close();
    }
}
