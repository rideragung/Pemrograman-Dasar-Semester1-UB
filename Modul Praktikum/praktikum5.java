import java.util.Scanner;
public class praktikum5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jam Kerja : ");
 int jamkerja = in.nextInt();
 int max = 60;
 int min = 50;
 int jam, upah ,lembur ,denda ,total; upah=0; lembur=0; denda=0;

 if (jamkerja > max){
 jam = jamkerja - max;
 upah = max*5000;
 lembur = jam*6000;
 } 
 else if (jamkerja >= min && jamkerja<=max){
 upah = jamkerja*5000;
 } 
 else if (jamkerja < min){
 jam = min - jamkerja;
 denda = jam*1000;
 upah = jamkerja*5000;
 } 
 
 total = upah+lembur-denda;
 System.out.println("Upah = Rp. "+upah);
 System.out.println("Lembur = Rp. "+lembur);
 System.out.println("Denda = Rp. "+denda);
 System.out.println("---------------------");
 System.out.println("Total : Rp. "+total);
    

    }
    
}
