package chap02;

public class Q7 {

    public static void main(String[] args) {

        final int VMAX = 21;

        int[] vdist = new int[VMAX];
        double[] data = new double[]{0.3, 0.3, 2.0, 1.5, 0.4, 1.2, 0.8};

        for (int i = 0; i < data.length; i++) {
            int temp = (int)(data[i] * 10);
            System.out.println(temp);
            vdist[temp] += 1;
        }


        for (int i = 0; i < vdist.length; i++) {
            System.out.println(i / 10.0 + "*".repeat(vdist[i]));
        }
    }
}
