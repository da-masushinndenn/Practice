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
    //��̎��
    private final Hand hands[];
    //���s�����J�E���g����ϐ�
    private int win = 0;
    private int lose =0;

    public Janken() {
        //��:�u�O�[�v�u�`���L�v�u�p�[�v�̒�`
        Hand GU = new Hand("�O�[");
        Hand CHO = new Hand("�`���L");
        Hand PA = new Hand("�p�[");
        GU.setStrongerThan(CHO);
        CHO.setStrongerThan(PA);
        PA.setStrongerThan(GU);
        Hand hands[] = { GU, CHO, PA };
        this.hands = hands;
    }

    //���������ɕϊ�
    Hand toHand(String name) {
        for (Hand hand: hands) {
            if (name.equals(hand.name)) {
                return hand;
            }
        }
        return null;
    }

    //�v���C���[�̎�
    Hand getPlayerHand() throws IOException {
        //���̓X�g���[���̐���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("�u�O�[�v�u�`���L�v�u�p�[�v�̂ǂꂩ��ł�����ŉ������@�ˁ@");
            Hand hand = toHand(br.readLine());
            if (hand != null) {
                System.out.println("���Ȃ����o�����̂́u" + hand.name + "�v�ł��B");
                return hand;
            }
            System.out.println("�u�O�[�v�u�`���L�v�u�p�[�v�ȊO�͑ł����܂Ȃ��ŉ�����");
        } while (true);
    }

    //cpu���o����
    Hand getCpuHand() {
        Hand hand = hands[(int)(Math.random()*hands.length)];
        System.out.println("�����o�����̂́u" + hand.name + "�v�ł��I�I");
        return hand;
    }

    //1�񏟕�
    void play() throws IOException {
        do {
            Hand player = getPlayerHand();
            Hand cpu = getCpuHand();
            if (player.won(cpu)) {
                System.out.println("���Ȃ��̏����ł��I������ˁI�I");
                System.out.println("***************************");
                win += 1;
                return;
            }
            if (cpu.won(player)) {
                System.out.println("���Ȃ��̕����ł��I����˂�I");
                System.out.println("***************************");
                lose += 1;
                return;
            }
            System.out.println("���[�����[�ŁH");
        } while (true);
    }

    //�ď����m�F
    private boolean retry() throws IOException {
        //���̓X�g���[���̐���
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("������x������ꍇ�́u1�v����͂��ĉ�����");
        int re = sc.nextInt();
        if(re == 1){
            System.out.println("�悵�I������񏟕����܂��傤�I");
            return true;
        }else{
            return false;
        }
    }

    //���s���\��
    private void winlose(){
        System.out.println("���Ȃ��̏��s��");
        System.out.println("�����F" + win + "��");
        System.out.println("�����F" + lose + "��");
        System.out.println("***************************");
    }

    public static void main(String[] args) {
        try{
            System.out.println("�����A���Ƃ���񂯂񂵂܂��傤�I�I�����ł���[�I�I");
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