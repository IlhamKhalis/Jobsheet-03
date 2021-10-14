public class Tugas1{
    public static void main(String args[]){
        String kampus = "Polinema";
        int tingkat = 1;
        char kelas = 'Z';
        int bilanganBulat = 10;
        double bilanganPecahan = 3.33333;
        char karakter = 'C';

        System.out.println(String.format("Saya mahasiswa %s kelas %s%s.", kampus, tingkat, kelas));
        System.out.println("Saya sedang belajar menampilkan nilai :");
        System.out.println("Bilangan Bulat " + bilanganBulat);
        System.out.println("Bilangan Pecahan " + (float)bilanganPecahan);
        System.out.println("Karakter " + karakter);
    }
}