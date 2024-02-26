package no2;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai UTS: ");
        int uts = scanner.nextInt();
        
        System.out.print("Masukkan nilai UAS: ");
        int uas = scanner.nextInt();
        
        System.out.print("Masukkan nilai Tugas: ");
        int tugas = scanner.nextInt();
        
        double nakhir = (0.35 * uts) + (0.45 * uas) + (0.2 * tugas);
        System.out.printf("Nilai Akhir: %.2f\n", nakhir);
        
        if (nakhir >=  80 && nakhir <=  100) {
            System.out.println("Indeks nilai: A");
        } else if (nakhir >=  70 && nakhir <  80) {
            System.out.println("Indeks nilai: B");
        } else if (nakhir >=  50 && nakhir <  70) {
            System.out.println("Indeks nilai: C");
        } else if (nakhir >=  40 && nakhir <  50) {
            System.out.println("Indeks nilai: D");
        } else if (nakhir >=  0 && nakhir <  40) {
            System.out.println("Indeks nilai: E");
        } else {
            System.out.println("N/A");
        }
        
        scanner.close();
    }
    
}
