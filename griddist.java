public class griddist {
    static int uniqueDistance(int r, int c){
        
        if (r==1 || c==1){
            return 1;
        }
        else
            return (uniqueDistance(r, c-1) + uniqueDistance(r-1, c));

    }
    public static void main(String[] args) {
        System.out.println(uniqueDistance(3, 3));
    }
}
