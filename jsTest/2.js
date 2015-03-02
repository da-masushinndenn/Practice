function check(){
	if(document.frml.lastname.value == ""){
		alert("姓を入力してください");
	}else if(document.frml.firstname.value == ""){
		alert("名を入力してください");
	}else if(!document.frml.gender[0].checked && !document.frml.gender[1].checked){
		alert("性別を選択してください");
	}else{
		document.frml.submit();
	}
}