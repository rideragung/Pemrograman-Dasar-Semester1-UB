import java.util.*;
public class praktikum12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("jumlah baris kolom");
        int barkol = in.nextInt();

        int[][] matrix = new int [barkol][barkol];
        for (int i=2;i<=barkol;i++){
            for (int j=2;j<=barkol;j++){
                
            matrix[i][j] = in.nextInt();
            }
        }
        for (int i=0;i<barkol;i++){
            for (int j=0;j<barkol;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }


        }
    }

