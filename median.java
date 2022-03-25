class median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double anss;
        int lena=nums1.length;
        int lenb=nums2.length;
        int lenf = lena+lenb;
        int[] finalarr = new int[lenf];
        int i=0,j=0,k=0;
        while(i<lena && j<lenb){
            if (nums1[i]<=nums2[j]){
                finalarr[k]=nums1[i];
                k++;
                i++;
            }
            else if (nums1[i]>nums2[j]){
                finalarr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<lena){
            finalarr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<lenb){
            finalarr[k]=nums2[j];
            j++;
            k++;
        }
        if(lenf%2!=0){
            anss=finalarr[lenf/2];
        }
        else {
            anss=(double)(finalarr[(lenf/2)-1]+finalarr[(lenf/2)])/2;
        }
        return anss;
        
        
    }
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {2};
        double ans = findMedianSortedArrays(a,b);
        System.out.println(ans);
    }
}