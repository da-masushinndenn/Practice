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
public class Practice3ronrienzan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//もし、コットン姫の攻撃力が　900以上　で　1000以下　で　
//かつ　
//コットン姫の必殺技ポイントが　200以上　で　500以下　なら
//　「必殺めろめろ弾発射！！」のメッセージを表示する
//さもなければ、コットン姫の攻撃力が　1000以上か
//または
//コットン姫の必殺技ポイントが　1000以上なら
//　「超必殺らぶらぶ弾発射！！」のメッセージを表示する
        
        //コットン姫の攻撃力、必殺ポイントを宣言
        int kottonAtack  = 0;
        int kottonHissatu = 2000;
        
        //もしコットン姫の攻撃力が900以上1000以下で かつ 必殺ポイントが200位上500以下
        if((kottonAtack >= 900 && kottonAtack <= 1000) && (kottonHissatu >= 200 && kottonHissatu <= 500)){
            //必殺めろめろ弾発射メッセージ表示
            System.out.println("必殺めろめろ弾発射！");
        //さもなければコットン姫の攻撃力が1000以上　または　必殺ポイントが1000以上なら
        }else if(kottonAtack >= 1000 || kottonHissatu >=1000 ){
            //超必殺らぶらぶ弾発射！メッセージ表示
            System.out.println("超必殺らぶらぶ弾発射！");
        }
        
    }

}
