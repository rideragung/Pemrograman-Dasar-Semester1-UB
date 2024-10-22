import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1,x2,y1,y2;
        double a,b,hasil;

                x1 = input.nextInt();
                y1 = input.nextInt();
                x2 = input.nextInt();
                y2 = input.nextInt();

                a = x2-x1;
                b = y2-y1;

                hasil= Math.sqrt(a*a+b*b);
        System.out.printf("%.3f",hasil);
    }
}
