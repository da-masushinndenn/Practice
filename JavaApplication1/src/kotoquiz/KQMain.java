/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kotoquiz;

/**
 *
 * @author ダーマス神殿
 */
public class KQMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*****************************************
        //定数
        //*****************************************
        //入力・表示処理モード
        final int EXEC_MODE_QUIZ = 1; //問題処理モード
        final int EXEC_MODE_CHECK = 1; //回答処理モード
        final int QUIZ_MAX = 3; //問題数
        
        //*****************************************
        //変数
        //*****************************************
        boolean loopFlg = true;//ループフラグ
        int inputNum = 0; //入力番号
        int execMode = EXEC_MODE_QUIZ; //処理モード（問題処理モードで開始）
        
        int nowQuizNum = 0; //現在出題番号
        int correctTotal = 0; //正解数
        //*****************************************
        //メイン処理
        //*****************************************
        while(loopFlg){
            ///////////////////////////////////////
            //実行と描画処理
            
            //問題処理モード
            if(execMode == EXEC_MODE_QUIZ){
            
            //テスト用：見出し表示
            System.out.println("*********** ことくいず　***********");
            System.out.println("        現在、" + (nowQuizNum + 1) + "問目です。");
            System.out.println("**********************************");
            System.out.println("");
            System.out.println("《　問題です　》");
            
            //問題を表示する
            switch(nowQuizNum){
                case 0:
                    System.out.println("変数の方でint型の最大値はいくつ？");
                    System.out.println("");
                    System.out.println("-----------------------------------------");
                    System.out.println("1：256　2：98776342　3：2147483647");
                    
                    break;
                case 1:
                    System.out.println("変数の方を変換するのに使い方法はどれ？");
                    System.out.println("");
                    System.out.println("-----------------------------------------");
                    System.out.println("1：キャスト　2：スコープ　3：インクリメント");
                    
                    break;
                case 2:
                    System.out.println("変数 a が「４位上でかつ１０以下」か「４０未満」");
                    System.out.println("正しい条件式はどれ？");
                    System.out.println("");
                    System.out.println("-----------------------------------------");
                    System.out.println("1：(a >= 4 || a < 10) && a < 40)");
                    System.out.println("2：(a >= 4 || a <= 10) || a < 40)");
                    System.out.println("3：(a >= 4 && a <= 10) || a < 40)");
                    
                    break;
            }
            System.out.println("答え＞");
            
            //解答処理モードへ変更
            execMode = EXEC_MODE_CHECK;
            
            //解答処理モード
            }else if(execMode == EXEC_MODE_CHECK){

            //解答をチェックする
            switch(nowQuizNum){
                case 0:
                    //正解番号チェック
                    if(inputNum == 3){
                        System.out.println("やったね！正解");
                        correctTotal += 1; //正解数加算
                    }else{
                        System.out.println("残念！不正解");
                    }
                
                    break;
                case 1:
                    //正解番号チェック
                    if(inputNum == 1){
                        System.out.println("やったね！正解");
                        correctTotal += 1; //正解数加算
                    }else{
                        System.out.println("残念！不正解");
                    }
                    
                    break;
                case 2:
                    //正解番号チェック
                    if(inputNum == 3){
                        System.out.println("やったね！正解");
                        correctTotal += 1; //正解数加算
                    }else{
                        System.out.println("残念！不正解");
                    }
                
                    break;
            }
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("《 １を入力してEnterキーを押して下さい 》");
            
            //問題を勧める
            nowQuizNum +=1;
            
            //最大数以上なら
            if(nowQuizNum >= QUIZ_MAX){
                loopFlg = false; //ゲームを終了する
            }
            
            //問題処理モードへ変更
            execMode = EXEC_MODE_QUIZ;
            }
            
            //キー入力処理
            int tmpInputNum = 0; //入力番号初期化
            try{
                //初期化処理
                final int IMPUT_MAX = 3; //最大入力値
                //キー入力読み込み処理（int型）
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int inputInt = sc.nextInt();
                //入力値チェックと入力番号への代入
                if(inputInt > 0 && inputInt <= IMPUT_MAX){
                    tmpInputNum = inputInt;
                }else{
                    System.out.println("※ コマンドは" + IMPUT_MAX +"以下で入力して下さい ※ ");
                }
            }catch (Exception e){
                System.out.println("※ 数字以外は入力しないで下さい ※");
            }
            //キー入力処理　ここまで
            
        }
        
        //結果表示
        System.out.println("**************** ことくいず　********************");
        System.out.println("");
        System.out.println("　　　　　　あなたの正解数は" + correctTotal +"でした。");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("おしまい");
                        
    }
    
}
