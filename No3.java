package no3;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();
        
        int jumlahMobil = jumlahPeserta /  7;
        if (jumlahPeserta %  7 >  0) {
            jumlahMobil +=  1;
        }
        
        System.out.println("Dengan jumlah peserta " + jumlahPeserta + ", maka mobil yang harus disediakan adalah " + jumlahMobil);
        
       scanner.close();
    }
    
}
