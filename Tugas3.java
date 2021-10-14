import java.util.Scanner;

public class Tugas3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float suhu, celcius, reamur, farenheit, kelvin;

        System.out.print("Masukkan Suhu : ");
        suhu = sc.nextFloat();

        celcius = suhu;
        reamur = 0.8f * suhu;
        farenheit = 1.8f * suhu + 32;
        kelvin = suhu + 273;

        System.out.println("Celcius     : " + celcius);
        System.out.println("Reamur      : " + reamur);
        System.out.println("Farenheit   : " + farenheit);
        System.out.println("Kelvin      : " + kelvin);
    }
}