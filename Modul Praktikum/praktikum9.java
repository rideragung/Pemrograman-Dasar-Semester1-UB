import java.util.*;
public class praktikum9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input Karakter Pertama    :");
        char a = in.next().charAt(0);
        System.out.print("Input Karakter Kedua      :");
        char b = in.next().charAt(0);

        char [][] pattern = new char [6][6];

        for (int i = 0; i < 6; i++){
            for (int x = 0; x < 6; x++){
                if((x % 2 == 0 && i % 2 == 0) || (x % 2 == 1 && i % 2 == 1)){
                    pattern[i][x] = a;
                }else{
                    pattern[i][x] = b;
                }
            }
        }
       System.out.println(Arrays.deepToString(pattern).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        in.close();
    }
    
}
