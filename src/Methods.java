public class Methods {
    int sum(int a, int b) {
        int c;
        if (a > b) {
            c = a + b;
        } else {
            c = a * b;
        }
        return c;
    }

    static void sstring() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        int x = 100;
        int y = 20;
        int z;
        Methods ref = new Methods();
        z = ref.sum(x, y);
        int p = 50;
        int r = 100;
        int v;
        v = ref.sum(p, r);
        System.out.println(z);
        System.out.println(v);
        sstring();
    }
}