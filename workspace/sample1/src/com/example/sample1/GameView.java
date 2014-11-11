package com.example.sample1;

import android.view.View;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.BitmapFactory;



public class GameView extends View {
	
	//�w�i�摜���i�[����ϐ���錾
	private Bitmap bgImage;
	
	//�A�j���[�V�����̃t���[����
	private int frameIndex = 0;
	
	//�v���C���[�摜���i�[����ϐ���錾
	private Bitmap[] player = new Bitmap[5];
	//�v���C���[��X���W
	private int playerX;
	//�v���C���[��Y���W
	private int playerY;
	//��ʁiCanvas�j������X���W
	private int canvasCX;
	//��ʁiCanvas)������Y���W
	private int canvasCY;
	
	//�R���X�g���N�^
	public GameView(Context context) {
		super(context);
	
	//���\�[�X�I�u�W�F�N�g���쐬
	Resources res = this.getContext().getResources();
	
	//�w�i�摜�ubg.png�v���r�b�g�}�b�v�ɕϊ����ĕϐ��ubgImage�v�ɓ����
	bgImage = BitmapFactory.decodeResource(res, R.drawable.bg);
	
	//�e�v���C���[�摜���r�b�g�}�b�v�ɕϊ����Ĕz��ɓ����
	player[0] = BitmapFactory.decodeResource(res, R.drawable.chopper1);
	player[1] = BitmapFactory.decodeResource(res, R.drawable.chopper2);
	player[2] = BitmapFactory.decodeResource(res, R.drawable.chopper3);
	player[3] = BitmapFactory.decodeResource(res, R.drawable.chopper4);
	player[4] = BitmapFactory.decodeResource(res, R.drawable.chopper5);
	}
	@SuppressLint("DrawAllocarion")
	
	//�X�[�p�[�N���X�i�p�����j�́uonDraw�v���\�b�h���I�[�o�[���C�h����
	@Override
	public void onDraw(Canvas canvas) {
	
	//��ʁiCanvas)������X���W���擾
	canvasCX = canvas.getWidth() / 2;
	//��ʁiCanvas)������Y���W���擾
	canvasCY = canvas.getHeight() / 2;
	//��ʁiCanvas)�T�C�Y�ɉ����Ĕw�i�摜���g�傷��
	bgImage = Bitmap.createScaledBitmap(bgImage, canvas.getWidth()*2, canvas.getHeight(), true);
	//�uplayScene�v���\�b�h�����s
	playScene(canvas);
	
	}
	
	//�uplayScene�v�̃��\�b�h
	public void playScene(Canvas canvas){
		//��ʁiCanvas)�ɔw�i�摜��ǉ�
		canvas.drawBitmap(bgImage, 0, 0, null);
		
		//�v���C���[�̏����\��X���W��ݒ�
		playerX = canvasCX - player[0].getWidth() / 2;
		//�v���C���[�̏����\��Y���W��ݒ�
		playerY = canvasCY - player[0].getHeight() / 2;
		//��ʁiCanvas)�Ƀv���C���[�摜�����Ԃɕ`��
		if(frameIndex > 4) frameIndex = 0;
		canvas.drawBitmap(player[frameIndex++], playerX, playerY, null);
	}

}
