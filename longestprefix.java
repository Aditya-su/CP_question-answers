public class longestprefix {
    public static void main(String[] args) {
        String[] arr = {"abccd", "abcce", "abcca"};

        String ans="";
        char temp;
        boolean state = true;
        int index = 0;
        while(state){
            temp = arr[0].charAt(index);
            for (String i : arr) {
                if (i.charAt(index)!=temp){
                    state = false;
                    break;
                }}
            index++;
            if (state==true)
                ans+=temp;
        }
    
    System.out.println(args[0]);
    System.out.println(ans);
    }}
