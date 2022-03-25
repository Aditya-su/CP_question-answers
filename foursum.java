
import java.util.HashMap;


public class foursum{
    static int calculate(int[] num1,int[] num2,int[] num3,int[] num4){
        HashMap<Integer,Integer> mapper = new HashMap<Integer,Integer>();
        //HashSet<Integer> gg = new HashSet<Integer>();
        int n = num1.length;
        int count=0;
        int temp;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                temp = num1[i]+num2[j];
                if (mapper.containsKey(temp))
                    mapper.put(temp, mapper.get(temp)+1);
                else
                    mapper.put(temp, 1);
                
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                temp = -1*(num3[i]+num4[j]);
                if(mapper.containsKey(temp))
                    count+=(1*mapper.get(temp));          
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0,2};

        System.out.println(calculate(A, B, C, D));
    }
}