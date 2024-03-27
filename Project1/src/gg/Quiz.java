package gg;

public class Quiz {
    int x;
    static int y;

    Quiz(int i) {
        x += i;
        y += i;
    }

    public static void main(String[] args) {
        new Quiz(2);
        Quiz mc = new Quiz(3);
        System.out.print(mc.x + "," + mc.y);
    }

}
