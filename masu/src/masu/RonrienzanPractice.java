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
public class RonrienzanPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int yuushaAttack = 0;//勇者の攻撃力を0に初期化
        int magicGem = 0;//魔法石を0に初期化
        int magicPotion = 5;//魔法薬を5に初期化
        
        //もし勇者の攻撃力が500位上で1000以下で、かつ
        //魔法石が7個または魔法薬を5個なら
        if((yuushaAttack >= 500 && yuushaAttack <= 1000)&&
          (magicGem ==7 || magicPotion == 5)){
            //超必殺技発動メッセージを表示
            System.out.println("超必殺技発動！！！");
        }
        System.out.println("全処理終わり");
    }
    
}
