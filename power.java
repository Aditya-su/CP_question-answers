import java.util.Scanner;

public class power {

    public static float pow(float x, int n){
        if (n==0) return 1;
        if (n==1){
            return x;
        }
        float ans = x*pow(x,--n);
        return ans;
    }

    public static void main(String[] args) {

        Scanner gg = new Scanner(System.in);
        float a = gg.nextFloat();
        int p = gg.nextInt();
        int changed = Math.abs(p);
        float ans = pow(a,changed);
        if (p<0){
            System.out.println(1/ans);
        }
        else
            System.out.println(ans);
        gg.close();
    }
}
