package level1;

public class 바탕화면정리 {
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = 50;
        int luy = 50;
        int rdx = 0;
        int rdy = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String[] split = wallpaper[i].split("");
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("#")) {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);

                    rdx = Math.max(rdx, i+1);
                    rdy = Math.max(rdy, j+1);
                }
            }
        }
        answer = new int[]{lux, luy, rdx, rdy};

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ",");
        }

        return answer;
    }


    public static void main(String[] args) {
        solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
    }
}
