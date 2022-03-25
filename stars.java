import java.util.Scanner;

public  class stars {
    public static void main(String[] args) { 
        String templine="";
        Scanner gg = new Scanner(System.in);
        int n = gg.nextInt();
        String temp = "";
        for (int i=0;i<4;i++){
            temp = gg.nextLine();
            templine+=temp;
        }
        templine = templine.replaceAll("\\s", "");
        gg.close();
        String sb="";
        char[][] arr = new char[3][n];
        int string_iterator = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                arr[i][j] =  templine.charAt(string_iterator);
                string_iterator+=1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                sb+=String.valueOf(arr[j][i]);
            }
            if (sb.equals("###")){
                System.out.print("#");
                sb="";
                continue;
            }
            else if (sb.equals("...")){
                sb="";
                continue;
            }
            else if (sb.equals(".****..**")){
                System.out.print("A");
                sb=""; 
            }

            else if (sb.equals("*********")){
                System.out.print("E");
                sb="";
            }

            else if (sb.equals("*.*****.*")){
                System.out.print("I");
                sb="";
            }

            else if (sb.equals("****.****")){
                System.out.print("O");
                sb="";
            }

            else if (sb.equals("***..****")){
                System.out.print("U");
                sb="";
            }
            
            else {
                continue;
            }
        }
    }    
}
