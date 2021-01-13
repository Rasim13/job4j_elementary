public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        int rsl = 0;
        if (percent * prize > pay) {
            rsl = (int) (percent * prize - pay);
        } else if (percent * prize - pay < pay || percent * prize - pay == 0) {
            rsl = 0;
        }
        return rsl;
    }
}
