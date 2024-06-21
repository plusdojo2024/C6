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
	setTimeout(next, 5000);
}


function next() {
	//'大吉', '吉', '吉', '中吉',の中をDAOの最大値にしたい
	const omikuji = ['大吉', '吉', '吉', '中吉', '中吉', '中吉', '小吉', '小吉', '小吉', '小吉', '末吉', '末吉', '末吉', '凶', '凶', '大凶'];
	const randomIndex = Math.floor(Math.random() * omikuji.length);
	const result = omikuji[randomIndex];
	window.alert('あなたの運勢は『' + result + '』です！');
	setTimeout(end, 0);

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
	main.src = "/c6/img/gacha.gif";
}