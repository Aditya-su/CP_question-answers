public class cube {
    static int mcube(int n){
        try{if (n==2)
            throw new Exception("test");}
        catch(Exception e){
           System.out.println(e.getMessage());
        }    
        return n*n*n;
    }
    public static void main(String[] arg){
        String[] args = {"2"};
        try{
        int x = Integer.parseInt(args[0]);
        System.out.println(mcube(x));
    }
        catch (NumberFormatException x){
            System.out.println(x.getStackTrace());
            System.out.println("Non Valid String");
        }
        
    }
}
