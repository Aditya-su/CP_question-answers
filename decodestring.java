import java.util.Stack;
public class decodestring {
    

    public static void main(String[] args) {
    Stack<Integer> numstack = new Stack<Integer>();
    Stack<String> strstack = new Stack<String>();
    Integer tempint;
    String temp="",ans="";
    String inp = "3[a2[bc]]";

        for(int i=0;i<inp.length();i++){  
            if (Character.isDigit(inp.charAt(i))){
                tempint = Character.getNumericValue(inp.charAt(i));
                numstack.push(tempint);
            }
            else if(inp.charAt(i)=='['){
                strstack.push(ans);
                ans = "";               
            }
            else if(inp.charAt(i)==']'){
                temp = strstack.pop();
                tempint = numstack.pop();
                while(tempint!=0){
                    temp = temp.concat(ans);
                    tempint--;
                }
                ans=temp;
                temp="";
            }
            else {
                ans+=String.valueOf(inp.charAt(i));
            }
        }
        System.out.println(ans);
        
    }


}
