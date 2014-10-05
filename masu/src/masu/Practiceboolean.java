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
public class Practiceboolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //変数 itemDarkStoneFlgをboolean型で宣言。falseに初期化
        boolean itemDarkStoneFlg = true;//アイテム取得フラグ：闇の魔石
        
        //項目表示
        System.out.println("《現在の持ち物》");
        
        //アイテム取得チェック：闇の魔石を持っているか
        if(itemDarkStoneFlg == true){
            //「闇の魔石」メッセージを表示
            System.out.println("闇の魔石");
        //持っていない場合
        }else{
            System.out.println("何も持っていません");
        }
    }
    
}
