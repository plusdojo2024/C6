/**
 *
 */
 function validateFileUpload() {
        const fileInput = document.forms["uploadForm"]["file"].files;

        if (fileInput.length === 0) {
            alert("画像をアップロードしてください。");
            return false; // フォームを送信しない
        }
        return true; // フォームを送信する
    }

