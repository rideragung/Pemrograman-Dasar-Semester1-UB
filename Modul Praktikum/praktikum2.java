import java.util.Scanner;
public class praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, kelurahan;
        int awal, akhir, biaya, ppj;

        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.print("Masukkan Nama                     : ");
        nama = input.nextLine();

        System.out.print("Kelurahan                         : ");
        kelurahan = input.nextLine();

        System.out.print("Masukkan posisi awal Kwh Meter    : ");
        awal = input.nextInt();

        System.out.print("Masukkan posisi akhir Kwh Meter   : ");
        akhir = input.nextInt();

        System.out.print("Masukkan biaya beban saat ini     : ");
        biaya = input.nextInt();

        System.out.print("Masukkan PPJ (dalam persen)       : ");
        ppj = input.nextInt();
        
        System.out.println("===================PLN Java===================");
        System.out.println("Nama                    : " + nama);
        System.out.println("Kelurahan               : " + kelurahan);
        int pemakaian = akhir - awal;
        System.out.println("Pemakaian bulan ini     : " + pemakaian);
        int tarif = pemakaian * biaya;
        System.out.println("Tarif Listrik           : Rp " + tarif + ",-");
        int ppjvalue = (tarif * ppj) / 100;
        System.out.println("PPJ 10%                 : Rp " + ppjvalue + ",-");
        int total = tarif + ppjvalue;
        System.out.println("Total Bayar             : Rp " + total + ",-");
    }
}
