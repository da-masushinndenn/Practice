package janken;
import java.io.*;

class Hand {
    public final String name;
    private Hand strongerThan;

    Hand(String name) {
        this.name = name;
    }

    void setStrongerThan(Hand hand) {
        this.strongerThan = hand;
    }

    Boolean won(Hand hand) {
        return this.strongerThan == hand;
    }
}

public class Janken {
    //手の種類
    private final Hand hands[];
    //勝敗数をカウントする変数
    private int win = 0;
    private int lose =0;

    public Janken() {
        //手:「グー」「チョキ」「パー」の定義
        Hand GU = new Hand("グー");
        Hand CHO = new Hand("チョキ");
        Hand PA = new Hand("パー");
        GU.setStrongerThan(CHO);
        CHO.setStrongerThan(PA);
        PA.setStrongerThan(GU);
        Hand hands[] = { GU, CHO, PA };
        this.hands = hands;
    }

    //文字列を手に変換
    Hand toHand(String name) {
        for (Hand hand: hands) {
            if (name.equals(hand.name)) {
                return hand;
            }
        }
        return null;
    }

    //プレイヤーの手
    Hand getPlayerHand() throws IOException {
        //入力ストリームの生成
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("「グー」「チョキ」「パー」のどれかを打ち込んで下さい　⇒　");
            Hand hand = toHand(br.readLine());
            if (hand != null) {
                System.out.println("あなたが出したのは「" + hand.name + "」です。");
                return hand;
            }
            System.out.println("「グー」「チョキ」「パー」以外は打ち込まないで下さい");
        } while (true);
    }

    //cpuが出す手
    Hand getCpuHand() {
        Hand hand = hands[(int)(Math.random()*hands.length)];
        System.out.println("私が出したのは「" + hand.name + "」です！！");
        return hand;
    }

    //1回勝負
    void play() throws IOException {
        do {
            Hand player = getPlayerHand();
            Hand cpu = getCpuHand();
            if (player.won(cpu)) {
                System.out.println("あなたの勝ちです！やったね！！");
                System.out.println("***************************");
                win += 1;
                return;
            }
            if (cpu.won(player)) {
                System.out.println("あなたの負けです！ざんねん！");
                System.out.println("***************************");
                lose += 1;
                return;
            }
            System.out.println("あーいこーで？");
        } while (true);
    }

    //再勝負確認
    private boolean retry() throws IOException {
        //入力ストリームの生成
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("もう一度続ける場合は「1」を入力して下さい");
        int re = sc.nextInt();
        if(re == 1){
            System.out.println("よし！もう一回勝負しましょう！");
            return true;
        }else{
            return false;
        }
    }

    //勝敗数表示
    private void winlose(){
        System.out.println("あなたの勝敗数");
        System.out.println("勝ち：" + win + "回");
        System.out.println("負け：" + lose + "回");
        System.out.println("***************************");
    }

    public static void main(String[] args) {
        try{
            System.out.println("さあ、私とじゃんけんしましょう！！勝負ですよー！！");
            Janken janken = new Janken();
            do {
                janken.play();
                janken.winlose();
            } while (janken.retry());
        }catch(IOException e){
            System.out.println("Exception :" + e);
        }
    }
}