'use strict'

// <js>ガチャを引くボタンを検知
// <js>ガチャエラー
//     1日に１回
//		のみべを登録してください
// <js>数字をランダム生成
// <ser>数字とユーザーをSQLのコレクションに送るサーブレットにPOSTメソッド
// <ser>ランダム数字と同じ酒名をSQLのitems_idからもってくる
// <js>windows.alertで結果を表示




function start() {
	main.src = "/c6/img/gachaspread.gif";
	document.getElementById("gacha").innerHTML = "ガチャを引く";
	setTimeout(next, 3000);
}


function next() {
	//20までの数字をランダム生成(20という数字は仮設定)
	const randomIndex = Math.floor(Math.random() * 20) + 1;
	//ランダム数字をテキストボックスに入力
	const inputElement = document.getElementById('gachaRandom');
	inputElement.value = randomIndex;
	//submitボタンを実行
	let submitButton = document.getElementById("gachaSubmit");
	submitButton.click();














	/*
		const result = omikuji[randomIndex];
		window.alert('あなたの運勢は『' + result + '』です！');
		setTimeout(end, 0);
	*/
	//サーブレットに送る
	/*	fetch('GachaServlet', {
			method: 'POST',
			headers: {
				'Content-Type': 'text/plain',
			},
			body: randomIndex.toString(), // 数値を文字列に変換して送信
		})
			.then(response => response.text())
			.then(data => {
				console.log('Response from server:', data);
			});*/
}


function end() {
	main.src = "/c6/img/gachatop.gif";
}