import java.util.Scanner;

public class stringcontain {
    public static Boolean check(String str, String inp){
        if(inp.length()>str.length() || inp.length()<=0){
            return false;
        }
        
        int j = 0;
        //for(char c : str)
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==inp.charAt(j)){
                j++;   
            }
            else if(str.charAt(i)!=inp.charAt(j)){
                j=0;
            }
            if(j==inp.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String inp = gg.nextLine();
        String org = "abad";
        System.out.println(check(org,"ad"));
        sc.close();
    }
}
