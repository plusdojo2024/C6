/* ここからハンバーガーボタン */
$(document).ready(function() {
	$('#open_nav').on('click', function() {
		$('#wrapper, #nav').toggleClass('show');
	});
});
/* ここまでハンバーガーボタン */


/* ニックネームチェック */
/* 文字数チェック(21字以上はfalse) */
/* HTML要素をオブジェクトとして取得する */
let nickObj = document.getElementById('nickname');
let errorMessageObj = document.getElementById('error_message');

/* [ログイン]ボタンをクリックしたときの処理 */
/*
nickObj.addEventListener('input', function() {
	if (nickObj.value.length >= 20) {
		errorMessageObj.textContent = '※２０字以内にしてください！';
	} else {
		errorMessageObj.textContent = null;
	}
});
*/

/*function checkNickname(nickname) {
	if (nickname.length <= 20) {
		return true;
	} */


/* パスワードチェック */
/* 半角英数字チェック */
function checkPassword(password) {
	if (password.match(/^[A-Za-z0-9]*$/)) {
		return true;
	}
	return false;
}



/* 10文字以上15文字以下
/* 10文字以上15文字以下 */
/*

function checkPassword(password) {
	if (password.match(/^{10,15}*$/)) {
		return true;
	}
	return false;
}
*/
/* パスワード一致チェック(パスワードjsかも) */
/* 秘密の質問チェック */
/*サウンド設定*/
/* ガチャを引く*/
/* ガチャ結果画面を表示 */
/* ガチャチェック */
/* コレクションの詳細ポップアップ */

/* 「open」「close」「ジョッキマーク」「更新前」「飲み会中」チェック*/
/* 備考欄チェック */

/* アイコンチェック */



