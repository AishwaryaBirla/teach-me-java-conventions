package powerpackage;

public class PowerFinder {
    public static int calculate(int base, int power) {
        int p = 1;
        for (int i = 0; i<power; i++) {
            p *= base;
        }
        return p;
    }
}
