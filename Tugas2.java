import java.util.Scanner;

public class Tugas2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double gaji, penjualan, total;

        System.out.print("Masukkan Gaji : ");
        gaji = sc.nextDouble();
        System.out.print("Masukkan Penjualan : ");
        penjualan = sc.nextDouble();

        total = penjualan * 0.15 + gaji;

        System.out.println("Total Gaji : " + total);
    }
}
