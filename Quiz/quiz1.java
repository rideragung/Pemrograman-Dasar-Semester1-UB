import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int max=70;
        int daftar,sisa,mod,tiap;
        System.out.println("masukan jumlah pendaftar");
        daftar = input.nextInt();
        mod = max%daftar;
        sisa = max-mod;
        tiap = sisa/daftar;
        System.out.println("masing-masing"+tiap);
        System.out.println("tersisa"+mod);
    }
}
