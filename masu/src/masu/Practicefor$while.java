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
public class Practicefor$while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        for(int i = 0; i < 10; i++){
//            
////現在のカウントをロケットの号数に補正
//            int num = i + 1;
        
        //ロケットの番号１～
        int i = 0;       
        
        while( true ){
            //現在のカウントをロケットの号数に補正
            int num = i +1;
            
            //ロケットを打ち上げるメッセージを表示
            System.out.println("ロケット" + num + "号機を打ち上げました。");
            
            //最後にカウントをアップする
            i = i + 1;
            
            //終了チェック処理
            if(i >= 10){
                break;
            }
        }
        
        //終了メッセージ
        System.out.println("計画完了");
    }
 }

//        以下自分の解答
//        System.out.println("計画完了");
//        //ロケットの番号１～
//        int num = 1;       
//        
//        while( true ){
//            //ロケットを打ち上げるメッセージを表示
//            System.out.println("ロケット" + num + "号機を打ち上げました。");
//        num = num + 1;
//            if(num > 10){
//                break;
//            }
//        }
//        
//        //終了メッセージ
//        System.out.println("計画完了");

    
