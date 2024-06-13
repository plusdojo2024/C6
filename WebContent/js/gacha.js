   'use strict'

// <js>ガチャを引くボタンを検知
// <js>ガチャエラー
//     1日に１回
//		のみべを登録してください
// <js>数字をランダム生成
// <ser>数字とユーザーをSQLのコレクションに送る
// <ser>ランダム数字と同じ酒名をSQLのitems_idからもってくる
// <js>windows.alertで結果を表示




    //const omikujiResults = SQLのコレクションにする;
    const button = document.getElementById('gacha');

    button.addEventListener('click', function() {
        const randomIndex = Math.floor(Math.random() * omikujiResults.length);
        const result = omikujiResults[randomIndex];

        window.alert('あなたの運勢は『' + result + '』です！');
    });