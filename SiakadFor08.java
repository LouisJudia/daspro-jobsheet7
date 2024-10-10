import java.util.Scanner;

public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int tidaklulus =0, lulus =0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai < 60){
                tidaklulus +=1;
            }
            else{
                lulus +=1;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidaklulus);
        System.out.println("Jumlah mahasiswa lulus : " + lulus);
    }
    
}