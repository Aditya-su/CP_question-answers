import java.util.Scanner;
import java.lang.Math;


public class LuckyNumber {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        int num,choice,iterator,ans=0;
        System.out.println("1. For Armstrong \n2. For Lucky ");
        choice = gg.nextInt();
        System.out.println("Enter Number ");
        num = gg.nextInt();
        int original=num;
        switch (choice) {
            case 1:
                while(num!=0){
                    iterator = num%10;
                    ans+=Math.pow(iterator, 3);
                    num /= 10;
                }
                if(original == ans)
                    System.out.println("True");
                else
                    System.out.println("False");
                break;
            
            case 2:

                break;
            
            default:
                System.out.println("Opps! Incorrect choice");
        }
        gg.close();
    }
}
