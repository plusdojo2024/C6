/**
 * let formObj = document.getElementById('regist_form');
 */



/* submitチェック */
function checkSubmit() {

	/* ニックネーム取得 */
	let nickname = document.getElementById('nickname');

	/* パスワード取得 */
	let password = document.getElementById('password');

	/* ニックネームチェック */
	let resultNickname = checkNickname(nickname);

	/* パスワードチェック */
	let resultPassword = checkPassword(password);

	if (resultNickname || resultPassword) {
		return true;
	}
	//ダイアログ表示入れるかも

	return false;
}
