package p0009;

/**
 * Created by Eric on 5/26/2014.
 */
public class PythagoreanTriplet {

    private int a;
    private int b;
    private int c;

    public void generateTriplet(int target) {
        for (a = 1; a <= target; a++) {
            for (b = 1; b <= target; b++) {
                int cSquare = (a * a) + (b * b);
                c = (int) Math.sqrt(cSquare);

                if (c * c == cSquare && a + b + c == target) {
                    return;
                }
            }
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

}
