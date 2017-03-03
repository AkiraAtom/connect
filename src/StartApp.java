/*
 * 2_Constructor
 * StartApp.java
 */

/**
 * アプリケーションクラス
 * @author emBex Education
 * @version 1.00
 */
public class StartApp {

    /**
     * コンストラクタの呼び出しを行う
     * @param args この引数は使用しない
     */
    public static void main(String[] args) {

        // Accountクラスのインスタンス生成をし、内容表示
        Account acc = new Account("田中一郎", 30000);
        acc.showAccount();

        // デフォルトコンストラクタが生成されないため
        // 以下のコードはコンパイルエラー
        // Account acc = new Account();
    }
}