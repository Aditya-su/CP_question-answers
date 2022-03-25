public class MyClass {
    
    static int adder(int a, int b){
        System.out.println(a);
        System.out.println(b);
        if (b<=a)  {return a;}
        int x = b + adder(a,--b);
        return x;
        
    }
    
    public static void main(String args[]) {
        System.out.println(adder(5,10));
    }
}