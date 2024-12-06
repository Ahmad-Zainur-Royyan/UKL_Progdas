import java.util.Scanner;

public class susah2 {

    public static void main(String[] args) {
        Scanner roy = new Scanner(System.in);

        System.out.println("-----------SELAMAT DATANG-----------");
        System.out.println();
        System.out.print("Mau berapa bilangan: ");
        int n = roy.nextInt();

        int[] bilangan = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = roy.nextInt();
        }

        StringBuilder negatifroy = new StringBuilder();
        for (int num : bilangan) {
            if (num < 0) {
                if (negatifroy.length() > 0) {
                    negatifroy.append(", ");
                }
                negatifroy.append(num);
            }
        }

        if (negatifroy.length() > 0) {
            System.out.println("Array mengandung elemen negatif adalah: " + negatifroy);
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }

        System.out.println();
        System.out.println("------------TERIMA KASIH------------");
        roy.close();
    }
}
