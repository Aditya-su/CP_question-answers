public class revint {
    public static int reverse(int n){
        int ans=0,flag,rem;
        flag = 0;
        if (n<0){
            flag=1;
            n = -n;}
        while(n!=0){
            rem = n%10;
            ans = (ans*10)+rem;
            n=n/10;
            if (ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)
            return 0;
        }
        if (ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)
            return 0;
        if (flag==1){
            ans = -ans;
            return ans;}
        return ans;
    }
    public static void main(String[] args) {
    
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(1534236469));
        
        

    }
}
