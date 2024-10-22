import java.util.*;

public class quiz6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p,l,r,s,luas,keliling;
        String pilihan;
        pilihan = in.nextLine();
        
        switch (pilihan){

            case "Persegi" :
            s = in.nextDouble();
            luas = s*s;
            keliling = 4*s;
            System.out.println("Jenis bangun datar : "+pilihan);
            System.out.printf("Luas : "+"%.2f\n",luas);
            System.out.printf("Keliling : "+"%.2f\n",keliling);
            break;

            case "Persegi Panjang" : 
            p = in.nextDouble();
            l = in.nextDouble();
            luas = p*l;
            keliling = 2*(p+l);
            System.out.println("Jenis bangun datar : "+pilihan);
            System.out.printf("Luas : "+"%.2f\n",luas);
            System.out.printf("Keliling : "+"%.2f\n",keliling);
            break;

            case "Lingkaran" : 
            r = in.nextDouble();
            luas =r*r*Math.PI;
            keliling =2*r*Math.PI;
            System.out.println("Jenis bangun datar : "+pilihan);
            System.out.printf("Luas : "+"%.2f\n",luas);
            System.out.printf("Keliling : "+"%.2f\n",keliling);
            break;   



        }



        
    }
}