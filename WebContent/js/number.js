function validateForm() {
    // 現在の4ナンバーと新しい4ナンバーの値を取得
    var subject = document.forms["numberForm"]["subject"].value;
    var newsubject = document.forms["numberForm"]["newsubject"].value;

    // 半角数字4桁の正規表現パターン
    var fourDigitPattern = /^[0-9]{4}$/;

    // 半角数字4桁以外の入力の場合
    if (!fourDigitPattern.test(newsubject)) {
        alert("4ナンバーは半角数字4桁で入力してください");
        return false; // フォームを送信しない
    }

    // 現在の4ナンバーと新しい4ナンバーが同じ場合
    if (subject === newsubject) {
        alert("現在の4ナンバーと同じです");
        return false; // フォームを送信しない
    }

    return true; // フォームを送信する
    }