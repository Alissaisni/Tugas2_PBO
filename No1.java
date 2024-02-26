package no1;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();
        
        if (bil1 %  2 ==  0 && bil2 %  2 ==  0) {
            System.out.println("Hasil penjumlahan: " + (bil1 + bil2));
        } else if (bil1 %  2 !=  0 && bil2 %  2 !=  0) {
            System.out.println("Hasil perkalian: " + (bil1 * bil2));
        } else {
            System.out.println("Bilangan yang diinput, salah satu atau keduanya bukan bilangan genap atau ganjil.");
        }
        
        scanner.close();
    }
    
}
