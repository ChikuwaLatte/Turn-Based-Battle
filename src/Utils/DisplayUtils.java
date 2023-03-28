package Utils;

public class DisplayUtils {
    /**
     * 文字列を一文字ずつ表示する
     * 
     * @param sentence 表示したい文字列
     * @param waitMilliSec 一文字ごとに待機する時間
     */
    public static void displaySentence(String sentence, int waitMilliSec) {
        sentence.chars().mapToObj(e -> String.valueOf((char)e)).forEach(e -> {
            System.out.print(e);
            try{
                Thread.sleep(waitMilliSec);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
    }
}
