/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;

import java.io.*;

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
