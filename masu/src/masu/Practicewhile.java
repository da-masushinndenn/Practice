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
public class Practicewhile {
    
    
    public static void main(String[] args) {

    /**
     * @param args the command line arguments
     */
    
    //＊＊＊＊変数＊＊＊＊
    final int LIFE_POINT_MAX = 1000;//生命力の最大値
    final int KAIFUKU_POINT = 200;//１回の回復量
    
    //＊＊＊＊変数＊＊＊＊
    boolean loopFlg = true;//ループ継続フラグ
    int yuushaLifePoint = 0;//勇者生命力
    
    //＊＊＊＊処理＊＊＊＊
    
    while( true ){
    //do {
        //回復処理
        yuushaLifePoint = yuushaLifePoint + KAIFUKU_POINT;
        
        //回復量を表示
        System.out.println(KAIFUKU_POINT + "回復しました");
        
        //現在の生命力
        System.out.println("現在の生命力：" + yuushaLifePoint);
        
        //生命力最大値以上になっていたら処理を終了する
        if(yuushaLifePoint >= LIFE_POINT_MAX){
            //loopFlg = false;//ループ継続フラグを消す      
            break;//ループを打ち切る
        }
        //終了メッセージ
        System.out.println("回復完了");
           
    }
    //while(loopFlg == true);
    //全終了メッセージ
    //System.out.println("全回復しました");
    }
}