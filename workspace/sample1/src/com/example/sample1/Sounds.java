package com.example.sample1;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public final class Sounds {
	
	//コンテキストを格納する変数
	private static Context context;
	//「MediaPlayer」クラスを格納する変数
	private static MediaPlayer mediaPlayer;
	//「SoundPool」クラスを格納する変数
	private static SoundPool soundPool;
	//効果音のサウンドファイルのリソースIDを格納する変数
	private static int sidSE;
	
	//初期化メソッド
	public static void init(final Context context) {
		//コンテキストを取得
		Sounds.context = context;
		//「SoundPool」クラス（管理クラス）の作成
		soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
		//サウンドファイルを読み込む
		sidSE = soundPool.load(context, R.raw.laser3, 1);
	}
	//効果音を再生するメソッド
	public static void playSE() {
		soundPool.play(sidSE, 1.0F, 1.0F, 0, 0, 1.0F);
	}
	//BGMを再生するメソッド
	public static void playBGM() {
		initBGM(R.raw.porcupop1min);
	}
	//BGMを一時停止するメソッド
	private static void pauseBGM() {
		if (mediaPlayer != null) mediaPlayer.pause();
	}
	//BGMを停止するメソッド
	public static void stopBGM() {
		if (mediaPlayer != null) mediaPlayer.stop();
	}
	//BGMの初期化と再生を開始するメソッド
	private static synchronized void initBGM(final int resourceId) {
		//「mediaPlayer」クラス（管理クラス）が「null」でないなら
		if(mediaPlayer != null) {
			//リソースを破棄
			mediaPlayer.release();
			//「mediaPlayer」フィールドに「null」を代入
			mediaPlayer = null;
		}
		
		//「MediaPlayer」クラス（管理クラス）のオブジェクトを作成しサウンドファイルを読み込む
		mediaPlayer = MediaPlayer.create(context, resourceId);
		//ループ再生を設定
		mediaPlayer.setLooping(true);
		//音量を設定
		mediaPlayer.setVolume(0.1F, 0.1F);
		//再生を開始
		mediaPlayer.start();
	}

}
