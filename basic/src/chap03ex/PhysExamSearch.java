package chap03ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {

            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.vision > o2.vision) ? -1 :
                        (o1.vision < o2.vision) ? 1 : 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하", 162, 1.5),
                new PhyscData("이수연", 168, 1.2),
                new PhyscData("황지안", 169, 0.9),
                new PhyscData("유서범", 171, 0.3)
        };

        System.out.println("키 몇??");
        double height = scan.nextDouble();

        int idx = Arrays.binarySearch(x, new PhyscData("", 0, 0.3), PhyscData.HEIGHT_ORDER
        );

        if (idx < 0) {
            System.out.println("없음");
        } else {
            System.out.println("찾은 데이터는 : " + x[idx]);
        }
    }

}
