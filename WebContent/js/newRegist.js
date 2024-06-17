/* 誕生日4桁チェック */
function checkBirth() {
let birthday = document.getElementById('birthday');
	if (birthday.length === 4) {
		return true;
	}
	 alert("4桁の数字で入力してください");
	return false;

}
