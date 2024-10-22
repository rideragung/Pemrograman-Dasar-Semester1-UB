import java.util.*;
public class praktikum7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
        // System.out.println("Masukkan angka");
        int nilai = in.nextInt();
        
        // System.out.println("Faktor-faktornya:");
        int tambah = nilai;
        System.out.println(nilai);
        for (int n = 0; n <= nilai; n++) {
            tambah--;
            if (tambah == 0){
                tambah = 1;
            }
            else if (nilai % tambah == 0) {
                System.out.println(tambah);
            }
        }
    }
}