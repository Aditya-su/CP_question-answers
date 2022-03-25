public class ktastic {
    
    public static int kTastic(int n, int k, int[] arr) {
        int count=0;
        int mul;
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                
                for(int l=i;l<=j;l++){
                    System.out.print(arr[l]+" ");
                    mul=1;
                    mul=mul*arr[l];
                }
                System.out.println("");
                // if(mul%10==k){
                //     count++;
                // }
                
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] o = {1,2,1};
        System.out.println(kTastic(3,2,o));
    }
}
