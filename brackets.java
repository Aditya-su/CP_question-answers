import java.util.HashMap;
import java.util.Stack;

class brackets {
    static public boolean isValid(String s1) {
        char[] s = s1.toCharArray();
        boolean flag = true;
        Stack<Character> stk = new Stack<Character>();
        HashMap<Character, Character> mapper = new HashMap<Character, Character>();
        mapper.put(')', '(');
        mapper.put(']', '[');
        mapper.put('}', '{');
        int length = s.length;
        if (length<=1)
            return false;
        for (char i:s){
            if (i=='('||i=='{'||i=='['){
                stk.add(i);
            }
            else {
                if(stk.isEmpty()){
                    return false;
                }
                else if (mapper.get(i)!=stk.pop())
                    return false;
                // else {
                //     stk.pop();
                // }
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        System.out.println(isValid("}{}(()}}}}(()){}{}[])[]"));
    }
}