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
public class Practiceswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //解答用変数を宣言。0で初期化
        int answerNum = 0;
        
        //解凍選択
        //問題です。音痴な人はだれ？
        //1：なぽ
        //2：こと
        //3：ことの隣にいた美人のおねーちゃん
        
        answerNum = 1;//選んだ番号に書き換えて下さい
        
        //メッセージを表示
        System.out.println("この中で音痴な人は誰？");
        System.out.println("１：なぽ");
        System.out.println("２：こと");
        System.out.println("３：ことの隣にいた美人のおねーちゃん");
        System.out.println("あなたの選んだ番号：" + answerNum);
        
        //選択処理
//        switch(answerNum){
//            //答えが1の場合
//            case 1:
//                System.out.println("正解");
//                System.out.println("どーせオンチですよ、ええ");
//            break;
//            
//            //答えが2の場合
//            case 2:
//                System.out.println("不正解");
//                System.out.println("吹雪の歌姫、超Cool！");
//            break;
//            
//            //答えが3の場合
//            case 3:
//                System.out.println("不正解");
//                System.out.println("プロばりに歌がうまくてボインなんだってば。");
//            //それ以外
//            default:
//                System.out.println("番号を１～３から選んでね");
//            break;    
        //選択処理
            if(answerNum == 1){
                System.out.println("正解");
                System.out.println("どーせオンチですよ、ええ");
            }else if(answerNum == 2){
                System.out.println("不正解");
                System.out.println("吹雪の歌姫、超Cool！");
            }else if(answerNum == 3){
                System.out.println("不正解");
                System.out.println("プロばりに歌がうまくてボインなんだってば。");
            }else{
                System.out.println("番号を１～３から選んでね！");

        }
    }
    
}
