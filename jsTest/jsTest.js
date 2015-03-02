function check(){
	var result = confirm("確認用のメッセージを表示します");
	if(result){
		console.log("OK");
	}else{
		console.log("キャンセル");
	}
}