function Ajax() {

  //リクエストJSON
  var request = {
    param1 : "favorite"
  };

  //ajaxでservletにリクエストを送信
  $.ajax({
    type    : "GET",          //GET / POST
    url     : "http://localhost:8080/c6/FriendServlet",  //送信先のServlet URL（適当に変えて下さい）
    data    : request,        //リクエストJSON
    async   : true,           //true:非同期(デフォルト), false:同期
    success : function(data) {
      //通信が成功した場合に受け取るメッセージ
      response1 = data["response1"];
      response2 = data["response2"];
    },
    error : function(textStatus, errorThrown) {
      alert("リクエスト時になんらかのエラーが発生しました：" + textStatus +":\n" + errorThrown);
    }
  });

}