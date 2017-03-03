/*
 * 2_Constructor
 * Account.java
 */

/**
 * 口座情報管理クラス
 * @author emBex Education
 * @version 1.00
 */
public class Account {
    private String name;  // 口座名義
    private int balance;  // 残高

    /**
     * コンストラクタ
     * @param nm  口座名義
     * @param bal 残高
     */
    public Account(String nm, int bal) {
        name = nm;
        balance = bal;
    }

    /**
     * 口座情報を表示する
     */
    public void showAccount() {
        System.out.println("口座名義：" + name);
        System.out.println("  残高  ：" + balance + "円");
    }
}