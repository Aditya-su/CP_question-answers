import java.util.Scanner;

class ReverseCalculator{
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int value = gg.nextInt();
        int ans = 0;
        int rem;
        while(value!=0){
            rem = value%10;
            ans = ans*10+rem;
            value /= 10;
        }
        System.out.println("The reverse string is: " + ans);
        gg.close();
    }
}