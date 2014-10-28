/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kotodebug;

/**
 *
 * @author ダーマス神殿
 */
public class KDMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //実行時エラーテスト
        System.out.println("");
        System.out.println("********** 実行時エラーテスト結果 **********");
        System.out.println("");
        
        int a = 3; //変数aを3で宣言して初期化
        System.out.println("100を" + a + "で割ると" + ( 100/a ) + "です");
        
        a -= 1;
        System.out.println("100を" + a + "で割ると" + ( 100/a ) + "です");
        
        //********************
        //論理エラーテスト
        System.out.println("");
        System.out.println("********** 論理エラーテスト結果 **********");
        System.out.println("");
        
        int b = 100;
        System.out.println("100を" + b + "で割ると" + (100/a) + "です");
    }
    
}
