import constant.*;
import Utils.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(Type.WATER.getDescription());
        DisplayUtils.displaySentence("これは文字列表示の実験です。", Config.STRING_DISPLAY_WAIT_TIME_PER_CHAR.getIntValue());

        // 開始、キャラ作成・選択フェーズ

        // 以下ループ
        // 戦闘開始

        // 戦闘ステータスのチェック（雨とか霧とか）

        // プレイヤー行動選択、エネミー行動選択

        // 行動順決定

        // 行動実行

        // プレイヤー・エネミーの状態チェック（瀕死・状態異常）

        // 勝敗判定

        // 戦闘終了

        // 得点加算、成長判定
        // 以上ループ

        // 最終得点計算、終了
    }
}
