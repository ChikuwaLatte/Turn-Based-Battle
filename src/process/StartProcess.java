package process;

import constant.*;
import utils.*;

public class StartProcess {
    public void start() {
        System.out.print("ゲームを開始します");
        DisplayUtils.performLoading(Config.PERFORM_LOADING_TIME.getIntValue());

        namingProcess();
    }

    private String namingProcess() {
        for (int count = 0;; count++) {
            DisplayUtils.displaySentence("名前を決めてください。", Config.STRING_DISPLAY_WAIT_TIME_PER_CHAR.getIntValue());
            String userName = DisplayUtils.scanInput();
            DisplayUtils.displaySentence(userName + " でよろしいですか？", Config.STRING_DISPLAY_WAIT_TIME_PER_CHAR.getIntValue());
            System.out.print("はい -> y, いいえ -> n：");
            String answer = DisplayUtils.scanInput();
            if (DisplayUtils.answerToBoolean(answer)) {
                return userName;
            }

            switch (count) {
                case 0:
                case 1:
                    DisplayUtils.displaySentence("もう一度入力してください。", Config.STRING_DISPLAY_WAIT_TIME_PER_CHAR.getIntValue());
                case 2:
                    DisplayUtils.displaySentence("その優柔不断さは良くないですよ。", Config.STRING_DISPLAY_WAIT_TIME_PER_CHAR.getIntValue());
                case 3:
                    DisplayUtils.displaySentence("暇なんですか？", Config.STRING_DISPLAY_WAIT_TIME_PER_CHAR.getIntValue());
                case 4:
                    DisplayUtils.displaySentence("さっさと決めてください。", Config.STRING_DISPLAY_WAIT_TIME_PER_CHAR.getIntValue());
                default:
                    DisplayUtils.displaySentence("zzz...", Config.STRING_DISPLAY_WAIT_TIME_PER_CHAR.getIntValue());
            }
        }
    }
}
