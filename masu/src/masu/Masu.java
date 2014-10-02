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
public class Masu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println((2048 * (1024 + 1024)) - 8658 +
        //                             896 * 1024);
        
        //変数a b c を宣言。同時に初期化
        int a = 0;
        int b = 0;
        int c = 0;
        
        //昼の合計を計算して変数aに代入
        a = 100 * 5;
        //昼の合計を表示
        System.out.println("昼の合計は" + a + "円です");
        
        //夜の合計を計算して変数bに代入
        b = 200 * 3;
        //夜の合計を表示
        System.out.println("夜の合計は" + b + "円です");
        
        //昼(変数a)と夜(変数b)の合計を計算して変数cに代入
        c = a + b;
        //昼と夜の合計を表示
        System.out.println("昼と夜の合計は" + c + "円です");
        
        
    }
    
}
