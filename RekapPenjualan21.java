import java.util.Scanner;
public class RekapPenjualan21 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    static void inputData(int[][] data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== INPUT DATA PENJUALAN ===");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Hari ke-" + (j+1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanTabel(int[][] data) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.printf("%-15s", "Menu");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Hari %d ", i);
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%6d ", data[i][j]);
            }
            System.out.println();
        }
    }

    static void tampilMenuTertinggi(int[][] data) {
        int maxTotal = -1;
        String menuTertinggi = "";

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menuTertinggi);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    static void tampilRataRata(int[][] data) {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = (double) total / data[i].length;

            System.out.printf("%-15s : %.2f%n", menu[i], rata);
        }
    }

    public static void main(String[] args) {

        int[][] penjualan = new int[5][7]; // 5 menu, 7 hari

        inputData(penjualan);
        tampilkanTabel(penjualan);
        tampilMenuTertinggi(penjualan);
        tampilRataRata(penjualan);
    }
}
