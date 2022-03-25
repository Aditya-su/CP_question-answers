

public class NQueen{

    private static int[][] pos;

    private static boolean findPosition(int queen, int dimension){

        if(queen==dimension)
            return true;
        
            for(int j=0; j<dimension; j++){
                if(isSafe(queen,j, dimension)){
                    pos[queen][0]=queen;
                    pos[queen][1]=j;
                    if(findPosition(queen+1, dimension)){
                        return true;
                    }
            }
        }
       
        return false;
    }

    private static boolean isSafe(int x, int y, int dimension){

        for(int i=0; i<dimension; i++){
            if(pos[i][0]==x)
             return false;
            
            if(pos[i][1]==y)
            return false;

            if(y == pos[i][1] + (x-pos[i][0]))
            return false;

            if(y == pos[i][1] - (x-pos[i][0]))
            return false;
        }

        return true;
    }


    public static void main(String[] args){
        int n = 4;
        pos = new int[n][2];
        for(int i=0; i<n; i++){
            pos[i][0]=-150; 
            pos[i][1]=-234;
        }

        findPosition(0,n);
        for(int i=0; i<n; i++){
            System.out.println("Pos "+ i +": [" + pos[i][0] + ", " + pos[i][1] +"]");
        }
    }
}
