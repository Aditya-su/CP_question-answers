import java.util.ArrayList;
import java.util.Arrays;

public class test {
  
    public static void main(String[] args) {
        int n = 15;
        System.out.println(n);
        String ar[] = new String[15];
        ArrayList<String> arl = new ArrayList<String>();
        System.out.println(ar);
        for (String i : ar) {
            System.out.println(i);
        }
        for (int i=1;i<=n;i++){
            if (i%3==0 && i%5==0){
                ar[i-1] = "BOTH";
                arl.add("both");
            }
            else if (i%3==0){
                ar[i-1] = "Three";
                arl.add("three");    
            }
            else if (i%5==0){
                ar[i-1]="Five";
                arl.add("five");
            }
            else    {
                ar[i-1] = Integer.toString(i);
                arl.add(Integer.toString(i));
        } }
        for (String i : ar) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(arl);

    }
    
}
