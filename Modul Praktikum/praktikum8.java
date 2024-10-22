import java.util.*;
public class praktikum8 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int y,z;
    y = in.nextInt();
    z = in.nextInt();
    int x = 1;
    while (x<=y){
        if (x%z==0){
            System.out.print("*");
        }else{
            System.out.print(x);
        }
            System.out.print(" ");
            x++;
        }
    }
    
}