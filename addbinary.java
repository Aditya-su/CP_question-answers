public class addbinary {
    static public String addBinary(String a, String b){
        StringBuilder ans = new StringBuilder("");
        int cur=0,carry=0;
        int i = a.length()-1;
        int j = b.length()-1;
        int t1,t2;
        while (i>-1 || j>-1){
            if (i<0)
                t1 = 0;
            else 
                t1 = Integer.parseInt(String.valueOf(a.charAt(i)));
            if (j<0)
                t2 = 0;
            else
                t2 = Integer.parseInt(String.valueOf(b.charAt(j)));
            cur = t1+t2+carry;
            if (cur==2){
                cur=0;
                carry=1;}
            else if (cur==3){
                cur=1;
                carry=1;
            }
            else 
                carry=0;
            ans.append(String.valueOf(cur)); 
            i--;
            j--;
        }
        if (carry==1){
            ans.append(String.valueOf(carry));
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}
