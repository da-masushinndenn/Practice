/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masu;

/**
 *
 * @author ダーマス神殿
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        パーティーを行います。パーティーには5人来る予定です。
        焼肉をするために一人当たり以下の食材を買います。
        カルビ100グラム（500円）、ロース100グラム（400円）、
        しまちょう50グラム（200円）、その他野菜など100グラム（200円）

        質問：
        １、一人当たりの食材のグラム数を出しなさい
        ２、一人当たりの食材の値段を出しなさい。
        ３、パーティーにかかる合計金額を出しなさい。
        */
        
//        //問.1 一人あたり食材のグラム数
//        System.out.println("一人あたりの食材グラム数は" + (100 + 100 + 50 + 100 ) + "グラムです");
//        
//        //問.2 一人あたりの食材の値段
//        System.out.println("一人あたりの食材の値段は" + (500 + 400 + 200 + 200) + "円です");
//        
//        //問.3 パーティーにかかる合計金額
//        System.out.println("パーティーにかかる合計金額は" + ((500 + 400 + 200 + 200) * 5) + "円です");
        
        //模範解答
        //変数を宣言する
        int shokuzaiGram = 100 + 100 + 50 + 100;
        int shokuzaiNedan = 500 + 400 + 200 + 200;
        int patyGoukei = shokuzaiNedan *  5;
        
        //標準出力に表示
        System.out.println("一人あたりの食材の重さは" + shokuzaiGram + "グラムです");
        System.out.println("一人あたりの食材の値段は" + shokuzaiNedan + "円です");
        System.out.println("パーティーにかかる合計金額は" + patyGoukei + "円です");
    }
    
}
