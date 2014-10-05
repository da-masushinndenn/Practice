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
public class Practiceforwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //もしiが100だったら
        for(int i = 999; 0 <= i; i--){
            if(i == 100){
//                System.out.println("打ち上げに失敗。起動を外れました");
//                System.out.println("ロケット計画を中断します");
//                break;
                System.out.println("休日のため、ロケットの打ち上げはありません");
                
                continue;
            }
            //現在のカウントをロケットの号数に補正
            int num = i + 1;
            //int num = 1000 - i;
            
            //ロケットを打ち上げるメッセージを表示
            System.out.println("ロケット" + num + "号機を打ち上げました。");
        }
        //終了メッセージ
        System.out.println("計画完了");
    }
    
}
