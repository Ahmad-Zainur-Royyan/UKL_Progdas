import java.util.Scanner; 

public class sedang2 {

    public static double hitungLuasPermukaanBola(double radius) {
        double phi = 22.0/7.0; 
        return 4 * phi *(radius*radius); 
    }

    public static void main(String[] args) {
        System.out.println("-----------SELAMAT DATANG-----------");
        System.out.println("");
        Scanner roy = new Scanner(System.in); 

        System.out.print("Masukkan jari-jari bola (radius): ");
        double radius = roy.nextDouble(); 

        double luasPermukaan = hitungLuasPermukaanBola(radius);

        System.out.println("Luas permukaan bola dengan jari-jari " + radius + " adalah " + luasPermukaan);

        roy.close(); 
        System.out.println("");
        System.out.println("------------TERIMA KASIH------------");
    }
}
