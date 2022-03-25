import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class plaindrome2 {
    static boolean cekr(String s){   
        int len = s.length();
        for (int i=0,j=len-1;   i<len/2;    i++,j--){
            // int j = len-i-1;
            if (s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;   
    }

    public static void main(String[] args) throws IOException {
        int count = 0;
        Scanner gg = new Scanner(System.in);
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
         
        String s = gg.nextLine();
        int num = Integer.parseInt(gg.nextLine());
        int[] set = new int[num];
        String[] kk;
        kk = bi.readLine().split("\\s");
        for (int i=0;i<kk.length;i++)
            set[i] = Integer.parseInt(kk[i]);

        for (int x: set){
            for (int i = 0; i <= s.length() - x; i++) {
            String substr = s.substring(i, i + x);
                if (substr.matches("[a-zA-Z]+")) { 
                    if(cekr(substr)){
                        count++;
                    }
                 }
            }
        }
        System.out.println(count);
        gg.close();

        

    }
}