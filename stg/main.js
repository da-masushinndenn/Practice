// - global -------------------------------------------------------------------
var screenStg, info;
var run = true;
var fps = 1000 / 30;
var mouse = new Point();
var ctx; //canvas2d コンテキスト格納用
var fire = false;
var counter = 0;

// - const ---------------------------------------------------------------------
var CHARA_COLOR = 'rgba(0, 0, 255, 0.75)';
var CHARA_SHOT_COLOR = 'rgba(0, 255, 0, 0.75)';
var CHARA_SHOT_MAX_COUNT = 10;

var charaShot = new Array(CHARA_SHOT_MAX_COUNT);
for(i = 0; i < CHARA_SHOT_MAX_COUNT; i++){
	charaShot[i] = new CharacterShot();
}

var ENEMY_COLOR = 'rgba(255, 0, 0, 0.75)';
var ENEMY_MAX_COUNT = 10;
var enemy = new Array(ENEMY_MAX_COUNT);
for(i = 0; i < ENEMY_MAX_COUNT; i++){
	enemy[i] = new Enemy();
}

// - main ---------------------------------------------------------------------
window.onload = function(){

    // スクリーンの初期化
    screenStg = document.getElementById('screen');
    screenStg.width = 256;
    screenStg.height = 256;
	
	// 2dコンテキスト
	ctx = screenStg.getContext('2d');

    // イベントの登録
    screenStg.addEventListener('mousemove', mouseMove, true);
    window.addEventListener('keydown', keyDown, true);

    // エレメント関連
    info = document.getElementById('info');
	
	//自動初期化
	var chara = new Caracter();
	chara.init(10);

    // レンタリング処理を呼び出す
    (function(){
        // HTMLを更新
        info.innerHTML = mouse.x + ' : ' + mouse.y;
		
		//screenStgクリア
		ctx.clearRect(0, 0, screenStg.width, screenStg.height);
		
		//パスの設定を開始
		ctx.beginPath();
		
		//自機の位置を設定
		chara.position.x = mouse.x;
		chara.position.y = mouse.y;
		
		//自機を書くパスを設定
		ctx.arc(chara.position.x, chara.position.y, chara.size, 0, Math.PI * 2, false);
		
		//自機の色を設定する
		ctx.fillStyle = CHARA_COLOR;
	
		//円を書く
		ctx.fill();
		
		//fireフラグの値により分岐
		if(fire){
			//すべての自機ショットを調査する
			for(i = 0; i < CHARA_SHOT_MAX_COUNT; i++){
				//自機ショットがすでに発射されているかチェック
				if(!charaShot[i].alive){
					//自機ショットを新規にセット
					charaShot[i].set(chara.position, 3, 5);
					//ループを抜ける
					break;
				}
			}
			//フラグを降ろしておく
			fire = false;
		}
		//パスの設定を開始
		ctx.beginPath();
		
		//すべての自機ショットを調査する
		for(i = 0; i < CHARA_SHOT_MAX_COUNT; i++){
			//自機ショットがすでに発射されているかチェック
			if(charaShot[i].alive){
				//自機ショットを動かす
				charaShot[i].move();
				
				//自機ショットを書くパスを設定
				ctx.arc(
					charaShot[i].position.x,
					charaShot[i].position.y,
					charaShot[i].size,
					0, Math.PI * 2, false
				);
				//パスを一旦閉じる
				ctx.closePath();
			}
		}
		//自機ショットの色を設定する
		ctx.fillStyle = CHARA_SHOT_COLOR;
		
		//自機ショットを描く
		ctx.fill();
		
		
		// エネミーの出現管理 -------------------------------------------------
		// 100 フレームに一度出現させる
		if(counter % 100 === 0){
			// すべてのエネミーを調査する
			for(i = 0; i < ENEMY_MAX_COUNT; i++){
				// エネミーの生存フラグをチェック
				if(!enemy[i].alive){
					// タイプを決定するパラメータを算出
					j = (counter % 200) / 100;
					
					// タイプに応じて初期位置を決める
					var enemySize = 15;
					p.x = -enemySize + (screenStg.width + enemySize * 2) * j
					p.y = screenStg.height / 2;
					
					// エネミーを新規にセット
					enemy[i].set(p, enemySize, j);
					
					// 1体出現させたのでループを抜ける
					break;
				}
			}
		}
		
		// エネミー -----------------------------------------------------------
		// パスの設定を開始
		ctx.beginPath();
		
		// すべてのエネミーを調査する
		for(i = 0; i < ENEMY_MAX_COUNT; i++){
			// エネミーの生存フラグをチェック
			if(enemy[i].alive){
				// エネミーを動かす
				enemy[i].move();
				
				// エネミーを描くパスを設定
				ctx.arc(
					enemy[i].position.x,
					enemy[i].position.y,
					enemy[i].size,
					0, Math.PI * 2, false
				);
				
				// パスをいったん閉じる
				ctx.closePath();
			}
		}
		
		// エネミーの色を設定する
		ctx.fillStyle = ENEMY_COLOR;
		
		// エネミーを描く
		ctx.fill();

		// イベントの登録
		screenStg.addEventListener('mousemove', mouseMove, true);
		screenStg.addEventListener('mousedown', mouseDown, true);
		window.addEventListener('keydown', keyDown, true);
		
        // フラグにより再帰呼び出し
        if(run){setTimeout(arguments.callee, fps);}
    })();
};

// - event --------------------------------------------------------------------
function mouseMove(event){
    // マウスカーソル座標の更新
    mouse.x = event.clientX - screenStg.offsetLeft;
    mouse.y = event.clientY - screenStg.offsetTop;
}

function keyDown(event){
    // キーコードを取得
    var ck = event.keyCode;

    // Escキーが押されていたらフラグを降ろす
    if(ck === 27){run = false;}
}
function mouseDown(event){
	//フラグを立てる
	fire = true;
}