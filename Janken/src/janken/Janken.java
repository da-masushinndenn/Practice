/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;
/**
 *
 * @author ダーマス神殿
 */
public class Janken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //「グー」「チョキ」「パー」の定数
        int GU = 0;
        int CHO = 1;
        int PA = 2;
        

        
        //はじめに表示される文字
        System.out.println("さあ！私とじゃんけんしましょう！！");
        System.out.println("準備はいいですか？");
        System.out.println("");
        System.out.println("");
        System.out.println("じゃ～んけ～ん？");
        
        
        //プレイヤー打ち込んだ文字を受け取る
        while(true){
            System.out.println("１～３を入力して下さい");
            System.out.println("１：「グー」");
            System.out.println("２：「チョキ」");
            System.out.println("３：「パー」");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int player = sc.nextInt();
            //じゃんけん用の乱数
            int cpu =(int)(Math.random()*3);
            //cpuが出す役
                if(cpu == GU){
                    System.out.println("私が出したのは「グー」です！！");
                }else if(cpu == CHO){
                    System.out.println("私が出したのは「チョキ」です！！");
                }else if(cpu == PA){
                    System.out.println("私が出したのは「パー」です！！");
                }
                if(player == 1){
                    System.out.println("あなたが出したのは「グー」です");
                }else if(player == 2){
                    System.out.println("あなたが出したのは「チョキ」です");
                }else if(player == 3){
                    System.out.println("あなたが出したのは「パー」です");
                }else{
                    System.out.println("１～３（半角数字）を入力して下さい");
                }

                if(player == 1 && cpu == GU){
                    System.out.println("あいこですね！");
                    System.out.println("");
                    System.out.println("あ～いこ～で？");
                }else if(player == 1 && cpu == CHO){
                    System.out.println("あなたの勝ちです！！");
                    System.out.println("おめでとう！");
                    break;
                }else if(player == 1 && cpu == PA){
                    System.out.println("あなたの負けです！");
                    System.out.println("ざ～んねん！");
                }else if(player == 2 && cpu == CHO){
                    System.out.println("あいこですね！");
                    System.out.println("");
                    System.out.println("あ～いこ～で？");
                }else if(player == 2 && cpu == PA){
                    System.out.println("あなたの勝ちです！！");
                    System.out.println("おめでとう！");
                    break;
                }else if(player == 2 && cpu == GU){
                    System.out.println("あなたの負けです！");
                    System.out.println("ざ～んねん！");
                    break;
                }else if(player == 3 && cpu == PA){
                    System.out.println("あいこですね！");
                    System.out.println("");
                    System.out.println("あ～いこ～で？");
                }else if(player == 3 && cpu == GU){
                    System.out.println("あなたの勝ちです！！");
                    System.out.println("おめでとう！");
                    break;
                }else if(player == 3 && cpu == CHO){
                    System.out.println("あなたの負けです！");
                    System.out.println("ざ～んねん！");
                    break;
                }
            }
        System.out.println("おしまい");
        }
        

        
        
}
    

