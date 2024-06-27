'use strict'

function start() {
	main.src = "/c6/img/gachaspread1.gif";
	document.getElementById("gacha").innerHTML = "ガチャを引く";
	setTimeout(next, 3000);
}

function next() {
	//水お茶の確率がそれぞれ40％、その他20％
	const probability = [0, 19, 19, 20, 20];
	const randomIndex = Math.floor(Math.random() * probability.length);

	//水お茶以外だった場合、再び抽選し、出力
	if (probability[randomIndex] < 18) {
		const randomNum = Math.floor(Math.random() * 20) + 1;
		const result = `/c6/img/gachaResult${randomNum}.png`;
		document.getElementById("after").src = result;
		setTimeout(end, 2000);

		//サーブレットに送信する
		function end() {
			document.getElementById("gachaRandom").value = randomNum;
			document.getElementById("gachaSubmit").click();
		}
	//水お茶の場合、出力
	} else {
		const Index = probability[randomIndex];
		const result = `/c6/img/gachaResult${Index}.png`;
		document.getElementById("after").src = result;
		setTimeout(end, 2000);

		//サーブレットに送信する
		function end() {
			document.getElementById("gachaRandom").value = Index;
			document.getElementById("gachaSubmit").click();
		}
	}
}