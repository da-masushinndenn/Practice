/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kotobeginnererror;

/**
 *
 * @author ダーマス神殿
 */
public class KBEMain {

    //********************************************
    // 定数
    //********************************************

    //********************************************
    // 変数
    //********************************************
    private static boolean loopFlg = true;//ループフラグ
    private static int inputNum = 0;//入力番号
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
    // TODO code application logic here

        //********************************************
        // メイン処理
        //********************************************
            while (loopFlg) {

                //テスト：番号入力表示
                System.out.print("テスト：番号を入力して下さい＞");

                //入力番号を受け取る
                inputNum = scanInputData();

                //テスト：入力された番号の表示
                System.out.println("テスト：入力された番号は　" + inputNum);
                
                //表示終了の区切り
                printSeparateMark();
            }    
        }    
    

     /**
     * キー入力処理
     */
    private static int scanInputData(){

        /////////////////////////////////////////////////////
        //キー入力処理　そのまま書き写してください　ここから
        int tmpInputNum = 0;//入力番号初期化
        try {
            //初期化処理
            final int IMPUT_MAX = 3;//最大入力値
            //キー入力読込処理（int型）
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int inputInt = sc.nextInt();
            //入力値チェックと入力番号への代入
            if (inputInt > 0 && inputInt <= IMPUT_MAX) {
                tmpInputNum = inputInt;
            } else {
                System.out.println("※　コマンドは" + IMPUT_MAX + "以下で入力して下さい　※　");
            }
        } catch (Exception e) {
            System.out.println("※　数字以外は入力しないで下さい　※　");
        }
        //キー入力処理　そのまま書き写してください　ここまで
        /////////////////////////////////////////////////////

        //入力番号を返す
        return tmpInputNum;
    }

     /**
     * 区切り処理
     */
    private static void printSeparateMark(){
        //表示終了の区切り処理
        System.out.println("");
        
        //3回区切りを表示する
        for(int i = 0 ; i < 3 ; i++ ){
          System.out.println("######################################################");
        }
        System.out.println("");
    }
    
}
