import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class regx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
        Scanner gg = new Scanner(System.in);
        String x = gg.nextLine();
        Matcher match = pattern.matcher(x);
        if (match.find()){
            System.out.println("Match Found");

        }
        else 
            System.out.println("Not Found");
        gg.close();
        }
}
