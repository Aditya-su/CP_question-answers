import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class polygonarea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] info = line1.trim().split(" ");
        int n = Integer.parseInt(info[0]);

        int[][] mat = new int[n][2]; 
        for (int i=0;i<n;i++){
            String ordi = br.readLine();
            String[] arr = ordi.trim().split(" ");
            mat[i][0] = Integer.parseInt(arr[0]);
            mat[i][1] = Integer.parseInt(arr[1]);
        }
        int[] anss = new int[n+1];
        for (int i=0;i<n-1;i++){
            int a = mat[i][0]*mat[i+1][1];
            int b = mat[i+1][0]*mat[i][1];
            int c= a-b;
            anss[i] = c;
        }
        int x = mat[n-1][0]*mat[0][1];
        int y = mat[n-1][1]*mat[0][0];
        int z = x-y;
        anss[n] = z;
        int ans = 0;
        for (int t : anss){
            ans+=t;
        }
        System.out.println(Math.abs(ans/2));

    }
}
