public class MethodOverloading {
    static void m1()
    {
        System.out.println("This is method 1");
    }
    static void m1(int a )
    {
        System.out.println("This is method" +" " +a);
    }
    static void m1(String s)
    {
        System.out.println("This is method" + " "+ s);
    }
    public static void main(String[] args) {
     m1();
     m1("Two");
     m1("Three");
    }
}
