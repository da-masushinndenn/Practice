package janken;

import java.io.*;

<<<<<<< HEAD
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
=======
/**
 *
 * @author �_�[�}�X�_�a
 */
public class Janken{

	//���s�����J�E���g����ϐ�

	private static int win = 0;
	private static int lose = 0;
	//������x��邩
	private static boolean retry = true;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args){
        // TODO code application logic here
		//�u�O�[�v�u�`���L�v�u�p�[�v�̒萔
		final int GU = 0;
		final int CHO = 1;
		final int PA = 2;

		//�v���C���[���ł����ޕ���
		String gu = "�O�[";
		String cho = "�`���L";
		String pa = "�p�[";

		System.out.println("�����A���Ƃ���񂯂񂵂܂��傤�I�I�����ł���[�I�I");
		//�v���C���[�ł����񂾕������󂯎��
		while(retry){
			try{
				//���̓X�g���[���̐���

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String player;
				while(true){
					//�u�O�[�v�u�`���L�v�u�p�[�v�̂ǂꂩ��ł�����ŉ������ƕ\���B
					System.out.println("�u�O�[�v�u�`���L�v�u�p�[�v�̂ǂꂩ��ł�����ŉ������@�ˁ@");
					player = br.readLine();
					if(gu.equals(player) || cho.equals(player) || pa.equals(player)){
						System.out.println("���Ȃ����o�����̂́u" + player + "�v�ł��B");
						break;
					}else{
						System.out.println("�u�O�[�v�u�`���L�v�u�p�[�v�ȊO�͑ł����܂Ȃ��ŉ�����");
					}
				}
				int cpu = (int) (Math.random() * 3);
				//cpu���o����
				if(cpu == GU){
					System.out.println("�����o�����̂́u�O�[�v�ł��I�I");
				}else if(cpu == CHO){
					System.out.println("�����o�����̂́u�`���L�v�ł��I�I");
				}else if(cpu == PA){
					System.out.println("�����o�����̂́u�p�[�v�ł��I�I");
				}
				switch(cpu){
					case 0:
						if(gu.equals(player)){
							System.out.println("���[�����[�ŁH");
						}else if(cho.equals(player)){
							System.out.println("���Ȃ��̕����ł��I����˂�I");
							System.out.println("***************************");
							lose += 1;
							winlose();
							retry();
						}else if(pa.equals(player)){
							System.out.println("���Ȃ��̏����ł��I������ˁI�I");
							System.out.println("***************************");
							win += 1;
							winlose();
							retry();
						}
						break;
					case 1:
						if(gu.equals(player)){
							System.out.println("���Ȃ��̏����ł��I������ˁI�I");
							System.out.println("***************************");
							win += 1;
							winlose();
							retry();
						}else if(cho.equals(player)){
							System.out.println("���[�����[�ŁH");
						}else if(pa.equals(player)){
							System.out.println("���Ȃ��̕����ł��I����˂�I");
							System.out.println("***************************");
							lose += 1;
							winlose();
							retry();
						}
						break;
					case 2:
						if(gu.equals(player)){
							System.out.println("���Ȃ��̕����ł��I����˂�I");
							System.out.println("***************************");
							lose += 1;
							winlose();
							retry();
						}else if(cho.equals(player)){
							System.out.println("���Ȃ��̏����ł��I������ˁI�I");
							System.out.println("***************************");
							win += 1;
							winlose();
							retry();
						}else if(pa.equals(player)){
							System.out.println("���[�����[�ŁH");
						}
						break;

				}

			}catch(IOException e){
				System.out.println("Exception :" + e);
			}
		}

	}

	private static void retry(){
		//���̓X�g���[���̐���
		try{
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("����񂯂���I������ꍇ�́u1�v����͂��ĉ�����");
			int re = sc.nextInt();
			if(re == 1){
				retry = false;
			}else{
				System.out.println("�悵�I������񏟕����܂��傤�I");
			}
		}catch(Exception e){
			System.out.println("�悵�I������񏟕����܂��傤�I");
		}
	}

	private static void winlose(){
		System.out.println("���Ȃ��̏��s��");
		System.out.println("�����F" + win + "��");
		System.out.println("�����F" + lose + "��");
		System.out.println("***************************");
	}
}
>>>>>>> 2bf0d76cab3ca0fea3b66253edce2d6d1327b39e
