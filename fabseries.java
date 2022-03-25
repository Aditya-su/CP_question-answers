public class fabseries {
    int fab(int x){
        if (x==1)
            return 1;
        else 
            return x+fab(x-1);
    }

    
    public static void main(String[] args) {
        fabseries gg = new fabseries();
        System.out.println(gg.fab(5));
    }
}
