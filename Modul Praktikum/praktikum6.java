import java.util.*;
public class praktikum6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();

        for (int baris = 1; baris <= n; baris++) {
      
        for (int bintang = 1; bintang <= baris; 
        bintang++){     
        System.out.print("*");
        } 
        System.out.println(" ");
        } 
    } 
}