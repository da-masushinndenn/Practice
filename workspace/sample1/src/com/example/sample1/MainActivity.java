package com.example.sample1;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;

public class MainActivity extends Activity {
	
	//view（「View」オブジェクトを格納する変数）の宣言
	private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        
        //「GameView」オブジェクトを作成
        view = new GameView(this);
        
        //アクティビティにビューを組み込む
        setContentView(view);
    }

}
