import javax.sound.sampled.SourceDataLine;

public class quiz8 {
    public static void main(String[] args) {
        int a=1,b=0;
        int i;

        for (i=8;i>1;i--) {
            if (i>=5 && i<7){
                a++;
                b--;

            }else{
                a=a+2;
                continue;
            }
            b=b+(-2);
        }
        System.out.println(a+"  "+b);
    }
}
