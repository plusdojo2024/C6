'use strict'

function start() {
	main.src = "/c6/img/gachaspread.gif";
	document.getElementById("gacha").innerHTML = "ガチャを引く";
	setTimeout(next, 3000);
}

function next() {
	//20までの数字をランダム生成(20という数字は仮設定)
	const randomIndex = Math.floor(Math.random() * 20) + 1;

}
//数字を入力し、サーブレットに送信
document.getElementById("gachaRandom").value = randomIndex;
document.getElementById("gachaForm").submit();

//結果を表示
const result = randomIndex;
window.alert(result);
setTimeout(end, 0);


function end() {
	main.src = "/c6/img/gachatop.gif";
}