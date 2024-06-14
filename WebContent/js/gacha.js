'use strict'

// <js>ガチャを引くボタンを検知
// <js>ガチャエラー
//     1日に１回
//		のみべを登録してください
// <js>数字をランダム生成
// <ser>数字とユーザーをSQLのコレクションに送る
// <ser>ランダム数字と同じ酒名をSQLのitems_idからもってくる
// <js>windows.alertで結果を表示




function start(){
	main.src="/c6/img/gachaafter.gif";
	document.getElementById("gacha").innerHTML="ガチャを引く";
	setTimeout(next,5000);
	}

function next(){

var omikuji = ['大吉', '吉', '吉', '中吉', '中吉', '中吉', '小吉', '小吉', '小吉', '小吉', '末吉', '末吉', '末吉', '凶', '凶', '大凶'];
var randomIndex=Math.floor(Math.random()*omikuji.length);
const result = omikujiResults[randomIndex];

document.getElementById("gacha").innerHTML = omikuji[random];
	window.alert('あなたの運勢は『' + result + '』です！');

}