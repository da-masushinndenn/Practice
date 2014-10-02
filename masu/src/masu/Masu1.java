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
public class Masu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //変数を宣言と初期化
        int a = 11;
        byte b = 99;
        
        //int型の変数をキャストしてbyte型変数に代入
        b = (byte)a;
        
        //変数を表示
        System.out.println("変数の値は" + b + "です");
    }
    
}
