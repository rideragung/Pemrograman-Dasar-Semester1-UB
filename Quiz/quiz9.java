import java.util.*;

public class quiz9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = 0;
        int B = 0;

        
        System.out.print("Enter Pemain A Name : ");
        String NA = in.nextLine();
        System.out.print("Enter Pemain B Name : ");
        String NB = in.nextLine();

        boolean[][] MR = new boolean[42][2];
        for (int i = 0; i < MR.length; i++) {
            System.out.print("Input Pemenang Round " + (i + 1) + " : ");
            MR[i][0] = in.nextBoolean();

            if (MR[i][0] == true) {
                MR[i][1] = false;
                A++;

            } else {
                MR[i][1] = true;
                B++;
                
            }
            if (A == 21) {
                System.out.println("Permainan Berakhir Pemenangnya adalah " + NA + " Final Score "+ A + " || "+ B);
                System.out.println("=============== MATCH HISTORY ===============");

                for (int n = 0; n <= i; n++) {
                    System.out.println(Arrays.toString(MR[n]));
                }
                break;
            } else if (B == 21) {
                System.out.println("Permainan Berakhir Pemenangnya adalah " + NB + " Final Score "+ A + " || "+ B);
                System.out.println("=============== MATCH HISTORY ===============");

                for (int n = 0; n <= 1; n++) {
                    System.out.println(Arrays.toString(MR[n]));
                }
                break;
            }

        }
        in.close();
    }
}
