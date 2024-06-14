/* ニックネームチェック */
/* 文字数チェック(21字以上はfalse) */
function checkNickname(nickname) {
	if (nickname.length <= 20) {
		return true;
	}
	return false;
}

/* パスワードチェック */
/* 半角英数字チェック */
function checkPassword(password) {
	if (password.match(/^[A-Za-z0-9]*$/)) {
		return true;
	}
	return false;
}


/* 10文字以上15文字以下 */
function checkPassword(password) {
	if (password.match(/^{10,15}*$/)) {
		return true;
	}
	return false;
}

/* パスワード一致チェック(パスワードjsかも) */



/* 誕生日チェック */
/* mm/ddの形式かチェック */
/* 存在する日付か */



/* 秘密の質問チェック */
/* 文字数チェック(21字以上はfalse) */


/*サウンド設定*/

/* ガチャを引く*/
/* ガチャ結果画面を表示 */
/* ガチャチェック */
/* コレクションの詳細ポップアップ */
/* 午前６時チェック */
/* 「open」「close」「ジョッキマーク」「更新前」「飲み会中」チェック*/
/* 備考欄チェック */
/* アイコンチェック */