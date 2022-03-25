public class missingnumber {
    public static int MissingNumber(int array[], int n) {
        int i=0;
        while(i<n-1){
            if (array[i]==n){
                n--;
                i=0;
                continue;
            }
            i++;
        }
        return n;
        }

        public static void main(String[] args) {
            int[] arr = {2,3,4,5,6,7};
            int size = arr.length;
            System.out.println(MissingNumber(arr, size));
        }
}
