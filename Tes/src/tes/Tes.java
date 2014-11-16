/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;
import java.io.*;
/**
 *
 * @author ダーマス神殿
 */
public class Tes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //プレイヤー打ち込んだ文字を受け取る
         try{
             while(true){
                //プレイヤーが打ち込む文字
                String gu = "グー";
                String cho = "チョキ";
                String pa = "パー";
                //入力ストリームの生成
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                //「グー」「チョキ」「パー」のどれかを打ち込んで下さいと表示。
                System.out.println("「グー」「チョキ」「パー」のどれかを打ち込んで下さい　⇒　");
                String player = br.readLine();
                System.out.println("あなたが出したのは「" + player + "」です。");

                if(gu.equals(player) || cho.equals(player) || pa.equals(player)){
                    System.out.println("あなたが出したのは「" + player + "」です。");
                    break;
                }else{
                    System.out.println("「グー」「チョキ」「パー」以外は打ち込まないで下さい");
                }
                
            }

        }catch(IOException e){
            System.out.println("Exception :" + e);
        }
    }
    
}
