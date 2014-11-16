package com.example.sample1;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public final class Sounds {
	
	//�R���e�L�X�g���i�[����ϐ�
	private static Context context;
	//�uMediaPlayer�v�N���X���i�[����ϐ�
	private static MediaPlayer mediaPlayer;
	//�uSoundPool�v�N���X���i�[����ϐ�
	private static SoundPool soundPool;
	//���ʉ��̃T�E���h�t�@�C���̃��\�[�XID���i�[����ϐ�
	private static int sidSE;
	
	//���������\�b�h
	public static void init(final Context context) {
		//�R���e�L�X�g���擾
		Sounds.context = context;
		//�uSoundPool�v�N���X�i�Ǘ��N���X�j�̍쐬
		soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
		//�T�E���h�t�@�C����ǂݍ���
		sidSE = soundPool.load(context, R.raw.laser3, 1);
	}
	//���ʉ����Đ����郁�\�b�h
	public static void playSE() {
		soundPool.play(sidSE, 1.0F, 1.0F, 0, 0, 1.0F);
	}
	//BGM���Đ����郁�\�b�h
	public static void playBGM() {
		initBGM(R.raw.porcupop1min);
	}
	//BGM���ꎞ��~���郁�\�b�h
	private static void pauseBGM() {
		if (mediaPlayer != null) mediaPlayer.pause();
	}
	//BGM���~���郁�\�b�h
	public static void stopBGM() {
		if (mediaPlayer != null) mediaPlayer.stop();
	}
	//BGM�̏������ƍĐ����J�n���郁�\�b�h
	private static synchronized void initBGM(final int resourceId) {
		//�umediaPlayer�v�N���X�i�Ǘ��N���X�j���unull�v�łȂ��Ȃ�
		if(mediaPlayer != null) {
			//���\�[�X��j��
			mediaPlayer.release();
			//�umediaPlayer�v�t�B�[���h�Ɂunull�v����
			mediaPlayer = null;
		}
		
		//�uMediaPlayer�v�N���X�i�Ǘ��N���X�j�̃I�u�W�F�N�g���쐬���T�E���h�t�@�C����ǂݍ���
		mediaPlayer = MediaPlayer.create(context, resourceId);
		//���[�v�Đ���ݒ�
		mediaPlayer.setLooping(true);
		//���ʂ�ݒ�
		mediaPlayer.setVolume(0.1F, 0.1F);
		//�Đ����J�n
		mediaPlayer.start();
	}

}