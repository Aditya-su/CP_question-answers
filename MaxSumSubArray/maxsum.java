package MaxSumSubArray;

public class maxsum {

    public static long sumarray(int[] a, int n){
        // HashSet<Long> set = new HashSet<>();
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        int size = arr.length;
        System.out.println(sumarray(arr, size));
    }
    
}
