public class plainfromINT {

    static int calc(int number){
        if (number < 100000) {
            if (number < 100) {
                if (number < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (number < 1000) {
                    return 3;
                } else {
                    if (number < 10000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        } else {
            if (number < 10000000) {
                if (number < 1000000) {
                    return 6;
                } else {
                    return 7;
                }
            } else {
                if (number < 100000000) {
                    return 8;
                } else {
                    if (number < 1000000000) {
                        return 9;
                    } else {
                        return 10;
                    }
                }
            }
        }
    }


    static public boolean plain(int n){
        boolean flag = false;
        if (n>=0){
            flag = true;
            int length = calc(n);
            if(length==1)
                return true;
            int a=1,b=10;
            int x,y;
            while(--length!=0){
                a=a*10;
            }
            while(a>=b){
                x=(n/a);
                //x=x/a;
                y=n%b;
                if(x!=y)
                    return false;
                n=n-(x*a);
                n=n/b;
                a=a/100;
            }

            }
            return flag;
            }
    
    public static void main(String[] args) {
        System.out.println(plain(1235321));
    }
}
