function checkBirth() {
    var name = document.querySelector('input[name="name"]').value;
    var password = document.querySelector('input[name="password"]').value;
    var passwordPattern = /^[a-zA-Z0-9]+$/;

    // ニックネームの長さチェック
    if (name.length > 20) {
        alert('ニックネームは20字以内入力してください');
        return false;
    }

    // パスワードの半角英数字チェック
    if (!passwordPattern.test(password)) {
        alert('パスワードは半角英数字で入力してください。');
        return false;
    }

    // パスワードの長さチェック
    if (password.length < 10 || password.length > 15) {
        alert('パスワードは10字以上15字以下で入力してください。');
        return false;
    }

    return true;
}