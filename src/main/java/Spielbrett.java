public class Spielbrett {

    // public static int[][](int borard){

    //}
    //int[] [] board = new int[5][5]

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(String direction) {
        if ("w".equals(direction)) {
            y++;
        } else if ("a".equals(direction)) {
            x--;

        }
        if ("s".equals(direction)) {
            y--;
        } else if ("d".equals(direction)) {
            x++;

        }
    }
}
