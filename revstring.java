import java.util.Arrays;

public class revstring {
    public static void main(String[] args) {
        char[] myarr = {'h','e','l','l','o','d'};
        int index = 0;
        int size = myarr.length;
        char temp;
        while(index<size/2){
            temp = myarr[size-index-1];
            myarr[size-index-1] = myarr[index];
            myarr[index] = temp;
            index++;
        }
        System.out.println(Arrays.toString(myarr));
    }
}
