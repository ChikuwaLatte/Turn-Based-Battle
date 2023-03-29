package utils;

import java.util.Scanner;

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
            threadSleep(waitMilliSec);
        });
        System.out.println("");
    }

    /**
     * ローディングの演出
     */
    public static void performLoading(int waitMilliSec) {
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            threadSleep(waitMilliSec);
        }
        System.out.println("");
        displaySeparator();
    }

    /**
     * 処理を指定ミリ秒数止める
     */
    public static void threadSleep(int waitMilliSec) {
        try{
            Thread.sleep(waitMilliSec);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * コンソールにセパレータを表示
     */
    public static void displaySeparator() {
        System.out.println("");
        System.out.println("***********************************");
        System.out.println("");
    }

    /**
     * 標準入力を受け付ける
     */
    public static String scanInput() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        return str;
    }
}
