public class VarArgs {
    static int sum (int...arrr)
    {
        int result = 0;
        for (int a : arrr)
        {
            result += a;
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println("Sum of 2,3,4 is : " + sum(2,3,4));
    }
}
