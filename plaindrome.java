import java.util.Scanner;

public class plaindrome {

static boolean cekr(String s){   
    int len = s.length();
    for (int i=0,j=len-1;   i<len/2;    i++,j--){
        // int j = len-i-1;
        if (s.charAt(i)!=s.charAt(j))
            return false;
    }
    return true;   
}
public static void main(String[] args) {

    Scanner intreader = new Scanner(System.in);
    String x = intreader.nextLine();

    boolean ans = cekr(x);
    System.out.println(ans);
    intreader.close();
}
}
