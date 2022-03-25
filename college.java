import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class college {


    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> college_seats = new HashMap<String, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] info = line1.trim().split(" ");
        
        int n = Integer.parseInt(info[1]);
        String line2 = br.readLine();
        String[] info2 = line2.trim().split(" ");
        for (int i=0;i<info2.length;i++){
            String name =  (String) "C-"+(i+1);
            college_seats.put(name, Integer.parseInt(info2[i]));
        }
        HashSet<Integer> done = new HashSet<Integer>();

        String[][] st_info = new String[n][5];

        for (int i=0;i<n;i++){
            String st_info_temp = br.readLine();
            String[] arr = st_info_temp.trim().split(",");
            for(int j=0;j<arr.length;j++){
                st_info[i][j] = arr[j];
            }
        }
        
        for(int i =0;i<n;i++){
            int k=i;
            float max = 0;
            for (int o=0;o<n;o++){
                if(done.contains(k))
                    continue;
                else if (Float.parseFloat(st_info[i][1])>max)
                    max = Float.parseFloat(st_info[i][1]);
                    k = o;
                }
            for (int t=2;t<5;t++){
                if(college_seats.get(st_info[k][t])>0){
                    System.out.println("Student-"+(i+1)+" "+st_info[k][t]);
                    college_seats.put(st_info[k][t], college_seats.get(st_info[k][t])-1);
                    break;
                }
            }   
        }
        // for(String x : college_seats.keySet()){
        //     System.out.println(x.toString()+" "+ college_seats.get(x).toString());
        // }
        System.out.println("\n");
        for (int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                System.out.print(st_info[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
