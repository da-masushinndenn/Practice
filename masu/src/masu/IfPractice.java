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
public class IfPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //変数 yuushaExpをint型で宣言。750に初期化
        int yuushaExp = 750;
        
        //もしyushaExpが 1000以上なら
        if(yuushaExp >= 1000){
            //レベルアップ！メッセージを表示
            System.out.println("レベルアップしました！");
            
        }else if(yuushaExp >= 900){
            //あと少し！メッセージを表示
            System.out.println("あと少し！" + "経験値：" + yuushaExp);
            
        //もしyuushaExpが700以上800以下ならエクトラレベルアップを表示
        }else if(yuushaExp >= 700 && yuushaExp <= 800){
                //特別レベルアップメッセージ表示
            System.out.println("エクストラレベルアップ");
        }else if(yuushaExp == 555 || yuushaExp == 666){
            //呪いにかかった！レベルダウンメッセージを表示
            System.out.println("呪いにかかった！レベルダウン！");
            
        //それ以外なら
        }else{
            //レベルアップはまだまだ！がんばれ！メッセージを表示
            System.out.println("もっとがんばれ！" + "経験値：" + yuushaExp);
        }
                   
        System.out.println("全処理終わり");
    }
    
}
