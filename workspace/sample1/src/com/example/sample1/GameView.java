package com.example.sample1;

import android.view.View;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.BitmapFactory;



public class GameView extends View {
	
	//背景画像を格納する変数を宣言
	private Bitmap bgImage;
	
	//アニメーションのフレーム数
	private int frameIndex = 0;
	
	//プレイヤー画像を格納する変数を宣言
	private Bitmap[] player = new Bitmap[5];
	//プレイヤーのX座標
	private int playerX;
	//プレイヤーのY座標
	private int playerY;
	
	//雲の画像を格納する変数
	private Bitmap cloud;
	//雲のX座標
	private int cloudX = 0;
	//雲のY座標
	private int cloudY = 0;
	//雲の水平方向の移動量
	private int cloudVX = -2;
	
	//画面（Canvas)中央のX座標
	private int canvasCX;
	//画面（Canvas)中央のY座標
	private int canvasCY;
		
	//コンストラクタ
	public GameView(Context context) {
		super(context);
	
	//リソースオブジェクトを作成
	Resources res = this.getContext().getResources();
	
	//背景画像「bg.png」をビットマップに変換して変数「bgImage」に入れる
	bgImage = BitmapFactory.decodeResource(res, R.drawable.bg);
	
	//背景画像「cloud1.gif」をビットマップに変換して変数「cloud」に入れる
	cloud = BitmapFactory.decodeResource(res, R.drawable.cloud1);
	
	//各プレイヤー画像をビットマップに変換して配列に入れる
	player[0] = BitmapFactory.decodeResource(res, R.drawable.chopper1);
	player[1] = BitmapFactory.decodeResource(res, R.drawable.chopper2);
	player[2] = BitmapFactory.decodeResource(res, R.drawable.chopper3);
	player[3] = BitmapFactory.decodeResource(res, R.drawable.chopper4);
	player[4] = BitmapFactory.decodeResource(res, R.drawable.chopper5);
	}
	@SuppressLint("DrawAllocarion")
	
	//スーパークラス（継承元）の「onDraw」メソッドをオーバーライドする
	@Override
	public void onDraw(Canvas canvas) {
	
	//画面（Canvas)中央のX座標を取得
	canvasCX = canvas.getWidth() / 2;
	//画面（Canvas)中央のY座標を取得
	canvasCY = canvas.getHeight() / 2;
	//画面（Canvas)サイズに応じて背景画像を拡大する
	bgImage = Bitmap.createScaledBitmap(bgImage, canvas.getWidth()*2, canvas.getHeight(), true);
	//「playScene」メソッドを実行
	playScene(canvas);
	
	}
	
	//「playScene」のメソッド
	public void playScene(Canvas canvas){
		//画面（Canvas)に背景画像を壁画
		canvas.drawBitmap(bgImage, 0, 0, null);
		
		//雲をスクロール表示するための処理
		
		//雲の座標を「cloudVX」ずつ移動する
		cloudX += cloudVX;
		//全体が画面から消えたら
		if(cloudX < -cloud.getWidth()){
			//また右から
			cloudX = canvas.getWidth();
			//高さ（Y座標）は画面上半分のランダムな位置から
			//雲が表示されるようにする
			cloudY = (int)Math.floor(Math.random() * canvasCY);
		}
		
		//画面（Canvas)に雲を描画
		canvas.drawBitmap(cloud, cloudX, cloudY, null);
		
		
		//プレイヤーの初期表示X座標を設定
		playerX = canvasCX - player[0].getWidth() / 2;
		//プレイヤーの初期表示Y座標を設定
		playerY = canvasCY - player[0].getHeight() / 2;
		//画面（Canvas)にプレイヤー画像を順番に描画
		if(frameIndex > 4) frameIndex = 0;
		canvas.drawBitmap(player[frameIndex++], playerX, playerY, null);
	}

}
