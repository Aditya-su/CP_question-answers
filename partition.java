

public class partition {
    static int pattern(int n, int m){
        if (n==0)
            return 1;
        else if (m==0 || n<0)
            return 0;
        else 
            return (pattern(n-m, m) + pattern(n, m-1));
    }

    public static void main(String[] args) {
        System.out.println(pattern(3, 3));
    }
}
