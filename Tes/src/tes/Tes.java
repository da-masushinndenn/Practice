/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;
import java.io.*;
/**
 *
 * @author �_�[�}�X�_�a
 */
public class Tes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //�v���C���[�ł����񂾕������󂯎��
         try{
             while(true){
                //�v���C���[���ł����ޕ���
                String gu = "�O�[";
                String cho = "�`���L";
                String pa = "�p�[";
                //���̓X�g���[���̐���
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                //�u�O�[�v�u�`���L�v�u�p�[�v�̂ǂꂩ��ł�����ŉ������ƕ\���B
                System.out.println("�u�O�[�v�u�`���L�v�u�p�[�v�̂ǂꂩ��ł�����ŉ������@�ˁ@");
                String player = br.readLine();
                System.out.println("���Ȃ����o�����̂́u" + player + "�v�ł��B");

                if(gu.equals(player) || cho.equals(player) || pa.equals(player)){
                    System.out.println("���Ȃ����o�����̂́u" + player + "�v�ł��B");
                    break;
                }else{
                    System.out.println("�u�O�[�v�u�`���L�v�u�p�[�v�ȊO�͑ł����܂Ȃ��ŉ�����");
                }
                
            }

        }catch(IOException e){
            System.out.println("Exception :" + e);
        }
    }
    
}
