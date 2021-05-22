package day24_Loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        System.out.println("U+1F923 starting: World's smallest cat \uD83D\uDC08- BBC video");

        while(seconds <= 177) {
            System.out.println("keep watching \uD83D\uDC08 video:" + seconds);
            seconds++;
            Thread.sleep(1000);

        }
        System.out.println("thanks for watching video");

    }


}
