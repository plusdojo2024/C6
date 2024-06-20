/* ハンバーガーボタン */
$(document).ready(function() {
	$('#open_nav').on('click', function() {
		$('#wrapper, #nav').toggleClass('show');
	});
});

/* 午前６時チェック */
function checkTime() {
	// 現在の日時を取得
	let now = new Date();

	// 現在の時刻の時と分を取得
	let hours = now.getHours();
	let minutes = now.getMinutes();

	// AM6:00の時刻を表すDateオブジェクトを作成
	let sixAM = new Date();
	sixAM.setHours(15, 12, 0, 0); // 時、分、秒、ミリ秒の順

	// 現在の時刻がAM6:00かどうかを比較
	if (hours === 15 && minutes === 12) {
		;
		// リセットボタンを実行
		let formElement = document.getElementById("locationResetBtn");
		if (formElement) {
			formElement.reset();
		}
		let formElement = document.getElementById("timeResetBtn");
		if (formElement) {
			formElement.reset();
		}
		//submitボタンを実行
		let submitButton = document.getElementById("submitBtn");
		if (submitButton) {
			submitButton.click();
		}


	}
}
// 1分ごとにチェック
setInterval(checkTime, 60000);

















/* ニックネームチェック */
/* 文字数チェック(21字以上はfalse) */
/* HTML要素をオブジェクトとして取得する */
let nickObj = document.getElementById('nickname');
let errorMessageObj = document.getElementById('error_message');

/* [ログイン]ボタンをクリックしたときの処理 */
nickObj.addEventListener('input', function() {
	if (nickObj.value.length >= 20) {
		errorMessageObj.textContent = '※２０字以内にしてください！';
	} else {
		errorMessageObj.textContent = null;
	}
});


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
