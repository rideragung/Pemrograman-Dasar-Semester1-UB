import java.util.Scanner;

public class praktikum4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Index Massa Tubuh (IMT)");
        System.out.print("Berat Badan (kg) : ");
        float berat = in.nextFloat();
        System.out.print("Tinggi Badan (m) : ");
        float tinggi = in.nextFloat();
        float imt = berat / (tinggi*tinggi);
        
        
        if (imt <= 18.5){
            System.out.printf("IMT  = %.2f \t Termasuk Kurus\n",imt);
        }
        else if(imt > 18.5 && imt <= 25){
            System.out.printf("IMT  = %.2f \t Termasuk Normal\n",imt);
        }
        else if(imt > 25 && imt <= 30){
            System.out.printf("IMT  = %.2f \t Termasuk Gemuk\n",imt);
        }
        else if(imt > 30){
            System.out.printf("IMT  = %.2f \t Termasuk Kegemukan\n",imt);
        }
    }
}
