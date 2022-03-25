import java.util.HashMap;

public class romantont {
        static public int romantoint(String s){
            int ans=0;
            int length = s.length();
            HashMap<Character, Integer> values = new HashMap<Character, Integer>();
            values.put('I', 1);
            values.put('V', 5);
            values.put('X', 10);
            values.put('L', 50);
            values.put('C', 100);
            values.put('D', 500);
            values.put('M', 1000);    
            int i = 0;
            while (i<length){
                if(i==length-1){
                    ans+=values.get(s.charAt(i));
                    return ans;
                }
                if(values.get(s.charAt(i))>=values.get(s.charAt(i+1))){
                    ans+=values.get(s.charAt(i));
                    i++;
                }
                else {
                    ans+=(values.get(s.charAt(i+1))-values.get(s.charAt(i)));
                    i+=2;
                }
            }
            return ans;
        }
public static void main(String[] args) {
    System.out.println(romantoint("MCMXCIV"));
}
    }
