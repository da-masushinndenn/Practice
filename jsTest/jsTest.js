window.onload = time;

function time(){
	dd = new Date();
	document.F1.T1.value = dd.toLocaleTimeString();
	setTimeout(time, 1000);
}

function al(){
	alert("Hello world!!");
}

function br(){
	var b = navigator.appName;
	var v = navigator.appVersion;
	alert(b);
	alert(v);
}
function ov(){
	alert('マウスオーバー！');
}

function jj(){
	var k = document.getElementById('jj');
	k.innerHTML = "<b>３の２乗は" + j(3) + "です</b><br>";
}

function j(a){
	return a * a;
}

function m(){
	var l = menseki(10, 20);
	var x = document.getElementById('menseki');
	x.innerHTML = "<b>" + l + "</b>";
}

function menseki(w, h){
	return "面積は" + w * h + "です。";
}

//曜日取得
var today = new Date();
var week = today.getDay();

var yobi = [
	"日曜日",
	"月曜日",
	"火曜日",
	"水曜日",
	"木曜日",
	"金曜日",
	"土曜日"
];

function tw(){
	var w = document.getElementById('week');
	w.innerHTML = "今日は" + yobi[week] + "です";
}


//function tw(){
//	var w = document.getElementById('week');
//	switch(week){
//		case 0:
//			w.innerHTML = "今日は日曜日です";
//			break;
//		case 1:
//			w.innerHTML = "今日は月曜日です";
//			break;
//		case 2:
//			w.innerHTML = "今日は火曜日です";
//			break;
//		case 3:
//			w.innerHTML = "今日は水曜日です";
//			break;
//		case 4:
//			w.innerHTML = "今日は木曜日です";
//			break;
//		case 5:
//			w.innerHTML = "今日は金曜日です";
//			break;
//		default:
//			w.innerHTML = "今日は土曜日です";
//	}
//}
