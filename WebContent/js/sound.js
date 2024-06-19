'use strict'


//音量設定　動作確認できていない
function setVolume(volume) {
	const MAX_VOLUME = 100;  // 最大の音量
	const audio = document.getElementById('volume');

	// 音量が0なら消音
	if (volume === 0) {
		audio.volume = 0;
	}
	// 音量が100なら最大音量
	else if (volume === MAX_VOLUME) {
		audio.volume = 1;  // 1は最大の音量（0〜1の範囲で設定）
	}
	// それ以外の場合、音量を指定された値に設定
	else {
		audio.volume = volume / MAX_VOLUME;
	}
}

//音を出す　動作確認できていない
const player = document.getElementById('player');
const audioPlayer = new Audio('/c6/MP3/HUROHUSHI.mp3');

let isPlaying = false;

player.addEventListener('click', function() {
	if (!isPlaying) {
		audioPlayer.play();
		player.textContent = '一時停止';
		isPlaying = true;
	} else {
		audioPlayer.pause();
		player.textContent = '再生';
		isPlaying = false;
	}
});