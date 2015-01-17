var timerID;

//マウス座標変数
var mousex;
var mousey;

//マウス座標変数
function evMouseMove(e){
	mousex = e.pageX;
	mousey = e.pageY;
}


//ゲーム開始関数（アンカークリックで呼ばれる）
function gameStart(){
	alert("OK押したら３秒待ってね");
	timerID = setTimeout("gameBody()", 3000);
}

//ゲーム初期化関数
function gameInit(){
	alert("ゲーム初期化");
}

//ゲームの本体の関数（メインループ）
function gameBody(){
	var f;
	clearTimeout(timerID);
	f = confirm("３秒経ちました！続けますか？");
	if(f){
		timerID = setTimeout("gameBody()", 3000);
	}	
}

//レイヤー表示・非表示
function lyrSetVisibility(lyr, visf){
	if(visf){
		document.getElementById(lyr).style.visibility = "visible";
	}else{
		document.getElementById(lyr).style.visibility = "hidden";
	}
}

//レイヤーの位置指定
function lyrSetPos(lyr, x, y){
	document.getElementById(lyr).style.left = x + 'px';
	document.getElementById(lyr).style.top  = y + 'px';
}

//レイヤーの座標取得
//左
function lyrGetLeft(lyr){
	return(parseInt(document.getElementById(lyr).style.left));
}
//上
function lyrGetTop(lyr){
	return(parseInt(document.getElementById(lyr).style.top));
}


