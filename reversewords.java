import java.util.Scanner;

public class reversewords {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        String inp = gg.nextLine();
        String ans="";
        int i,j;
        int lenght = inp.length();
        i=lenght;
        j=lenght;
        
        while(i>=0 && j>=0){
            while(Character.isWhitespace(inp.charAt(i-1))){
                i-=1;
                j-=1;    
            }
            //while(String.valueOf(inp.charAt(i))!=" ")
            while (!Character.isWhitespace(inp.charAt(i-1)))
            {
                i-=1;
                if(i==0)
                    break;    
            }
            if(!ans.isEmpty()){
                ans+=" ";
            }
            for(int k=i;k<j;k++){
                    ans+=String.valueOf(inp.charAt(k));
            }
            i-=1;
            j=i;

        }
        System.out.println(ans);
        gg.close();
    }
}
