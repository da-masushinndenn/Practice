package com.example.sample1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;
import android.os.Handler;

public class MainActivity extends Activity {
	
	//view（「View」オブジェクトを格納する変数）の宣言
	private View view;
	
	//ハンドラの作成
	private Handler handler = new Handler();
	//ビューの再壁画間隔
	private final static long MSEC = 40;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        
        //「GameView」オブジェクトを作成
        view = new GameView(this);
        
        //アクティビティにビューを組み込む
        setContentView(view);
        
        //ビュー再壁画タイマー
        //タイマーを作成
        Timer timer = new Timer(false);
        
        //「MSEC]ミリ秒おきにタスク（TimerTask）を実行
        timer.schedule(new TimerTask() {
        	public void run(){
        		handler.post(new Runnable(){
        			public void run(){
        				//ビューを再壁画
        				view.invalidate();
        			}});
        		}
           	}, 0, MSEC);
			
    }

}
