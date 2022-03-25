public class StudentTester{
    public static void main(String[] args){
        Student st1 = new Student();
        Student st2 = new Student();
        st1.setName("Rohan");
        st2.setName("Vishal");
        st1.set_studentId(11);
        st2.set_studentId(12);
        int x = st1.get_StudentId();
        String xn = st1.getName();
        int y = st2.get_StudentId();
        String yn = st2.getName();
        System.out.println(x);
        System.out.println(xn);
        System.out.println(y);
        System.out.println(yn);
    }
}