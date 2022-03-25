public class trailingzeros {
    
    public static int zero(int n){
        int count = 0;
        for (int i=5;n/i>=1;i*=5){
            count+=n/i;   
        }
        return count;
    }
    
    public static void main(String[] args) {
        int ans = zero(100);
        System.out.println(ans);
    }
}
