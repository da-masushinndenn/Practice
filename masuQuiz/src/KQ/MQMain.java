/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KQ;

/**
 *
 * @author ダーマス神殿
 */
public class MQMain {
        
    //*****************************************
    //定数
    //*****************************************
    //入力・表示処理モード
    private static final int EXEC_MODE_QUIZ = 1; //問題処理モード
    private static final int EXEC_MODE_CHECK = 2; //回答処理モード
    private static final int QUIZ_MAX = 4; //問題数

    //*****************************************
    //変数
    //*****************************************
    private static boolean loopFlg = true;//ループフラグ
    private static int inputNum = 0; //入力番号
    private static int execMode = EXEC_MODE_QUIZ; //処理モード（問題処理モードで開始）

    private static int nowQuizNum = 0; //現在出題番号
    private static int correctTotal = 0; //正解数

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //*****************************************
        //メイン処理
        //*****************************************
        while (loopFlg) {
            ///////////////////////////////////////
            //実行と描画処理

            //問題処理モード
            if (execMode == EXEC_MODE_QUIZ) {
                
                //問題処理モード関数呼び出し
                execModeQuiz();


                //解答処理モード
            } else if (execMode == EXEC_MODE_CHECK) {

                //解答処理モード関数呼び出し
                exeModeCheck();

            }


            
            //入力番号を受け取る
            inputNum = ScanInputData();
            
            //表示終了の区切り
            System.out.println("");
            System.out.println("######################################################");
            System.out.println("");

        }

        //結果表示
        if(correctTotal == 0){
        System.out.println("**************** ダーマスクイズ　********************");
        System.out.println("貴様には地獄すら生ぬるい！！");
        System.out.println("　　　　　　あなたの正解数は" + correctTotal + "でした。");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("おしまい。ちゃんちゃん");
        
        }else if (correctTotal == 1){
        System.out.println("**************** ダーマスクイズ　********************");
        System.out.println("");
        System.out.println("　　　　　　あなたの正解数は" + correctTotal + "でした。");
        System.out.println("************************************************");
        System.out.println("まだまだ甘いね！修行してでなおしな！");
        System.out.println("");
        System.out.println("おしまい。ちゃんちゃん");   

        }else if (correctTotal == 2){
        System.out.println("**************** ダーマスクイズ　********************");
        System.out.println("");
        System.out.println("　　　　　　あなたの正解数は" + correctTotal + "でした。");
        System.out.println("************************************************");
        System.out.println("あなたの理解度は50%です。これではいけませんね。");
        System.out.println("");
        System.out.println("おしまい。ちゃんちゃん");
        
        }else if (correctTotal == 3){
        System.out.println("**************** ダーマスクイズ　********************");
        System.out.println("");
        System.out.println("　　　　　　あなたの正解数は" + correctTotal + "でした。");
        System.out.println("************************************************");
        System.out.println("おしい！っていうかあと１門！がんばれよ！");
        System.out.println("");
        System.out.println("おしまい。ちゃんちゃん");
        
        }else if (correctTotal == 4){
        System.out.println("**************** ダーマスクイズ　********************");
        System.out.println("");
        System.out.println("　　　　　　あなたの正解数は" + correctTotal + "でした。");
        System.out.println("************************************************");
        System.out.println("素敵！・・・抱いて！");
        System.out.println("");
        System.out.println("");
        System.out.println("注）モー○ーではありません。");
        System.out.println("");
        System.out.println("YOU WIN! PERFECT!");        
        
        }

    }

    /**
     * 問題処理モード
     */
    private static void execModeQuiz(){
        //テスト用：見出し表示
        System.out.println("*********** ダーマスクイズ　***********");
        System.out.println("        現在、" + (nowQuizNum + 1) + "問目です。");
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("《　問題です　》");

        //問題を表示する
        switch (nowQuizNum) {
            case 0:
                System.out.println("ダーマスが一番好きな馬はどれ？");
                System.out.println("");
                System.out.println("-----------------------------------------");
                System.out.println("1：レッドリヴェール　2：ゴールドアクター　3：アロマティコ");

                break;
            case 1:
                System.out.println("ダーマスがよく行くBarの名前は？");
                System.out.println("");
                System.out.println("-----------------------------------------");
                System.out.println("1：レガーメ　2：マティーニ　3：チョリース");

                break;
            case 2:
                System.out.println("ムイネ～ムイネ～なサ～ア～でシ～コ～もタ～イ～。");
                System.out.println("一番適切な意味を選べ");
                System.out.println("");
                System.out.println("-----------------------------------------");
                System.out.println("1：とっても眠い。さあ、一日がんばろう！");
                System.out.println("2：ムイネ～！（挨拶）シコっと鯛が釣れちゃうよ！");
                System.out.println("3：寝起きがとっても悪い。腰も痛い。");

                break;
            case 3:
                System.out.println("トゥートゥートゥトゥートゥトゥー　トゥトゥトゥトゥ～？");
                System.out.println("");
                System.out.println("-----------------------------------------");
                System.out.println("1：トゥルルルールトゥル～");
                System.out.println("2：ッピポッ　ピポ～リロ～リロッ");
                System.out.println("3：チャラララ～ン　チャラ　チャラ～ン");
                
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
            case 3:
                //正解番号チェック
                correctTotal = checkAnswerData(2, inputNum, correctTotal);
                
                break;
                
        }

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
            System.out.println("正解。・・・なかなかやるではないか");
            seikaiGoukei += 1;//正解数加算
        }else{
            System.out.println("不正解。　貴様の実力はその程度か？");
        }
        
        //結果を返す
        return seikaiGoukei;
    }
    
        private static int ScanInputData(){
                    //キー入力処理
        int tmpInputNum = 0; //入力番号初期化
        try {
            //初期化処理
            final int IMPUT_MAX = 3; //最大入力値
            //キー入力読み込み処理（int型）
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int inputInt = sc.nextInt();
            //入力値チェックと入力番号への代入
            if (inputInt > 0 && inputInt <= IMPUT_MAX) {
                tmpInputNum = inputInt;
            } else {
                System.out.println("※ コマンドは" + IMPUT_MAX + "以下で入力して下さい ※ ");
            }
        } catch (Exception e) {
            System.out.println("※ 数字以外は入力しないで下さい ※");
        }
        return tmpInputNum;
            //キー入力処理　ここまで
    }

}
