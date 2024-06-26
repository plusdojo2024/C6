 function toggleFormSection() {
    var openRadio = document.getElementById("motivation1");
    var formSection = document.getElementById("formSection");
    if (openRadio.checked) {
        formSection.classList.remove("hidden");
    } else {
        formSection.classList.add("hidden");
    }
}

function changeDisplay() {
    var openRadio = document.getElementById("motivation1");
    openRadio.checked = !openRadio.checked;
    toggleFormSection();
}

(function() {
    var radios = document.getElementsByName('motivation');
    for (var i = 0; i < radios.length; i++) {
        radios[i].addEventListener('change', toggleFormSection);
    }
})();




/* 午前６時チェック */
function checkTime() {
	// 現在の日時を取得
	let now = new Date();

	// 現在の時刻の時と分を取得
	let hours = now.getHours();
	let minutes = now.getMinutes();

	// AM6:00の時刻を表すDateオブジェクトを作成
	let sixAM = new Date();
	sixAM.setHours(16, 30, 0, 0);

	// 現在の時刻がAM6:00かどうかを比較
	if (hours === 16 && minutes === 30) {
		// 時刻が一致した場合
		console.log("現在の時刻は " + hours + ":" + minutes + " だよ。");

		//submitボタンを実行
		let submitButton = document.getElementById("clock");
		if (submitButton) {
			submitButton.click();
		}

	} else {
		//6時じゃなくてもsubmitボタンを実行
		let submitButton = document.getElementById("clock");
		if (submitButton) {
			submitButton.click();
		}
	}

	// 初回のチェック実行
	checkTime();

	// 1分ごとにチェック
	setInterval(checkTime, 60000);
}

