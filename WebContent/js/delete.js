/**
 *
 */
 document.addEventListener("DOMContentLoaded", function() {
    let deleteForm = document.getElementById('delete_form');

    deleteForm.onsubmit = function(event) {
        let confirmation = confirm('本当に削除しますか？');
        if (!confirmation) {
            event.preventDefault();  // フォームの送信をキャンセルします
        }
    };
});