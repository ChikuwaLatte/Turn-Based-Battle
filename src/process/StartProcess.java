package process;

import constant.*;
import utils.*;

public class StartProcess {
    public static void start() {
        System.out.print("ゲームを開始します");
        DisplayUtils.performLoading(Config.PERFORM_LOADING_TIME.getIntValue());
    }
}
