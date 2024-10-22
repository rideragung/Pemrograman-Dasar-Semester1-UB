import java.util.*;
public class praktikum13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A[][]= new int[2][2];
        int B[][]= new int[2][2];
        int C[][]= new int[2][2];

        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                A[i][j]=in.nextInt();
            }
        }
        for(int k=0;k<2;k++){

            for(int l=0;l<2;l++){
                
                B[k][l]=in.nextInt();
            }
        }
        int m=2;
        int q=2;
        int p=2;

        int jumlah=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < p; k++) {
                    jumlah = jumlah + A[i][k] * B[k][j];
                }
                C[i][j] = jumlah;
                jumlah = 0;
            }
        }
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.print(C[x][y]+" ");
            }
            System.out.println(" ");
        }
    }
}