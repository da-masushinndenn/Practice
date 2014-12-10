/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;

import java.io.*;

/**
 *
 * @author ダーマス神殿
 */
public class Janken{

	//勝敗数をカウントする変数

	private static int win = 0;
	private static int lose = 0;
	//もう一度やるか
	private static boolean retry = true;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args){
        // TODO code application logic here
		//「グー」「チョキ」「パー」の定数
		final int GU = 0;
		final int CHO = 1;
		final int PA = 2;

		//プレイヤーが打ち込む文字
		String gu = "グー";
		String cho = "チョキ";
		String pa = "パー";

		System.out.println("さあ、私とじゃんけんしましょう！！勝負ですよー！！");
		//プレイヤー打ち込んだ文字を受け取る
		while(retry){
			try{
				//入力ストリームの生成

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String player;
				while(true){
					//「グー」「チョキ」「パー」のどれかを打ち込んで下さいと表示。
					System.out.println("「グー」「チョキ」「パー」のどれかを打ち込んで下さい　⇒　");
					player = br.readLine();
					if(gu.equals(player) || cho.equals(player) || pa.equals(player)){
						System.out.println("あなたが出したのは「" + player + "」です。");
						break;
					}else{
						System.out.println("「グー」「チョキ」「パー」以外は打ち込まないで下さい");
					}
				}
				int cpu = (int) (Math.random() * 3);
				//cpuが出す役
				if(cpu == GU){
					System.out.println("私が出したのは「グー」です！！");
				}else if(cpu == CHO){
					System.out.println("私が出したのは「チョキ」です！！");
				}else if(cpu == PA){
					System.out.println("私が出したのは「パー」です！！");
				}
				switch(cpu){
					case 0:
						if(gu.equals(player)){
							System.out.println("あーいこーで？");
						}else if(cho.equals(player)){
							System.out.println("あなたの負けです！ざんねん！");
							System.out.println("***************************");
							lose += 1;
							winlose();
							retry();
						}else if(pa.equals(player)){
							System.out.println("あなたの勝ちです！やったね！！");
							System.out.println("***************************");
							win += 1;
							winlose();
							retry();
						}
						break;
					case 1:
						if(gu.equals(player)){
							System.out.println("あなたの勝ちです！やったね！！");
							System.out.println("***************************");
							win += 1;
							winlose();
							retry();
						}else if(cho.equals(player)){
							System.out.println("あーいこーで？");
						}else if(pa.equals(player)){
							System.out.println("あなたの負けです！ざんねん！");
							System.out.println("***************************");
							lose += 1;
							winlose();
							retry();
						}
						break;
					case 2:
						if(gu.equals(player)){
							System.out.println("あなたの負けです！ざんねん！");
							System.out.println("***************************");
							lose += 1;
							winlose();
							retry();
						}else if(cho.equals(player)){
							System.out.println("あなたの勝ちです！やったね！！");
							System.out.println("***************************");
							win += 1;
							winlose();
							retry();
						}else if(pa.equals(player)){
							System.out.println("あーいこーで？");
						}
						break;

				}

			}catch(IOException e){
				System.out.println("Exception :" + e);
			}
		}

	}

	private static void retry(){
		//入力ストリームの生成
		try{
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("じゃんけんを終了する場合は「1」を入力して下さい");
			int re = sc.nextInt();
			if(re == 1){
				retry = false;
			}else{
				System.out.println("よし！もう一回勝負しましょう！");
			}
		}catch(Exception e){
			System.out.println("よし！もう一回勝負しましょう！");
		}
	}

	private static void winlose(){
		System.out.println("あなたの勝敗数");
		System.out.println("勝ち：" + win + "回");
		System.out.println("負け：" + lose + "回");
		System.out.println("***************************");
	}
}
