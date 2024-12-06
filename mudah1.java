import java.util.Scanner;

public class mudah1 {
    public static void main(String[] args) {

        double diskon = 0;
        int hargabarang;
        double total;

        System.out.println("-----------SELAMAT DATANG-----------");
        System.out.println(" ");

        Scanner roy = new Scanner(System.in);
        System.out.println("Masukkan Harga Total Barang Anda = ");
        hargabarang = roy.nextInt();

        if (hargabarang <= 100000) {
            diskon = 0; 
        } else if (hargabarang <= 200000) {
            diskon = 0.1; 
        } else {
            diskon = 0.2; 
        }

        total = hargabarang - (hargabarang*diskon);

        System.out.println("Total Harganya adalah : " +total);

        roy.close();

        System.out.println(" ");
        System.out.println("------------TERIMA KASIH------------");
    }
}
