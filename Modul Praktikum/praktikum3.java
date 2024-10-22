import java.util.Scanner;

public class praktikum3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("MENCARI LUAS DAN KELILING");
        double a, b, r, luas, keliling;
        System.out.println("Menu    :");
        System.out.println("1.Menghitung luas dan keliling persegi panjang");
        System.out.println("2.Menghitung luas dan keliling lingkaran");
        System.out.println("3.Menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda :    ");
        int pilihan = in.nextInt ();
        switch (pilihan){
            
            case 1 : System.out.println("Menghitung luas dan keliling persegi panjang");
                System.out.print("Masukkan panjang sisi (cm)  : ");
                a = in.nextInt();
                System.out.print("Masukkan lebar sisi (cm)    : ");
                b = in.nextInt();
                luas = a*b;
                System.out.println("Luas Persegi Panjang            :  "+(int)luas+"cm");
                keliling = 2*(a+b);
                System.out.println("Keliling Persegi Panjang        :  "+(int)keliling+"cm");
                break;
            case 2 : System.out.println("Menghitung luas dan keliling lingkaran");
                System.out.print("Masukkan jari-jari (cm) :");
                r = in.nextInt();
                luas =  r*r*3.14;
                System.out.println("Luas        :"+(int)luas+"cm");
                keliling = (int) 2*3.14;
                System.out.println("Keliling    :"+(int)keliling+"cm");
                break;
            case 3 : System.out.println("Menghitung luas dan keliling segitiga");
                System.out.print("Masukkan alas a (cm)         :");
                a = in.nextInt();
                System.out.print("Masukkan tinggi b (cm)       :");
                b = in.nextInt();
                System.out.print("Masukkan sisi samping r (cm) :");
                r = in.nextInt();
                
                keliling = a+b+r;
                System.out.println("Keliling Segitiga                   :"+(int)keliling+""+"cm");
                luas = (a*b)*1/2;
                System.out.println("Luas Segitiga                       :"+(int)luas+""+"cm2");
                break;
            default : System.out.println("Data tak ditemukan, program dihentikan...  ");

        }
    }
}