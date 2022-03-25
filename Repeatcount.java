import java.util.HashMap;
import java.util.Scanner;

public class Repeatcount {
    public static void main(String[] args) {
        HashMap<Character, Integer> mapper = new HashMap<Character, Integer>();
        Scanner gg = new Scanner(System.in);
        String input = gg.nextLine();
        int length = input.length();
        char temp;
        for (int i=0;i<length;i++){
            temp = input.charAt(i);
                if(mapper.containsKey(temp)){
                    mapper.put(temp, mapper.get(temp)+1);
                }
                else {
                    mapper.put(temp, 1);
                }
        }
        for (Character x : mapper.keySet()){
            System.out.print(x+":"+mapper.get(x)+" ");
        }
        gg.close();
    }
}
