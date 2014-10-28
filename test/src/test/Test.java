/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ダーマス神殿
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
        private static void execModeQuiz(){
        //テスト用：見出し表示
        System.out.println("*********** ことくいず　***********");
        System.out.println("        現在、" + (nowQuizNum + 1) + "問目です。");
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("《　問題です　》");

        //問題を表示する
        switch (nowQuizNum) {
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

    }
    
    /**
     * 解答処理モード
     */
    private static void exeModeCheck(){
        switch (nowQuizNum) {
            case 0:
                //正解番号チェック
                correctTotal = checkAnswerData(3,inputNum,correctTotal);

                break;
            case 1:
                //正解番号チェック
                correctTotal = checkAnswerData(1, inputNum, correctTotal);

                break;
            case 2:
                //正解番号チェック
                correctTotal = checkAnswerData(3, inputNum, correctTotal);

                break;
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("《 １を入力してEnterキーを押して下さい 》");

        //問題を勧める
        nowQuizNum += 1;

        //最大数以上なら
        if (nowQuizNum >= QUIZ_MAX) {
            loopFlg = false; //ゲームを終了する
        }

        //問題処理モードへ変更
        execMode = EXEC_MODE_QUIZ;
    }
    
     /**
     * 
     * @return 入力番号 
     */
    
    /**
     * 
     * @param seikaiBangou 正解の番号
     * @param kaitouBangou 入力番号
     * @param seikaiGoukei 正解数
     * @return 正解数
     */
    private static int checkAnswerData(int seikaiBangou , int kaitouBangou , int seikaiGoukei){
    
        //解答チェック
        if(kaitouBangou == seikaiBangou){
            System.out.println("やったね！正解");
            seikaiGoukei += 1;//正解数加算
        }else{
            System.out.println("残念！不正解");
        }
        
        //結果を返す
        return seikaiGoukei;
    }
    
}
