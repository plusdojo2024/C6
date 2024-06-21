package test;
import java.util.List;

import dao.UsersDAO;
import model.Users;

public class UsersDaotest {
	public static void main(String[] args) throws Exception {
		UsersDAO dao = new UsersDAO();
		List<Users> cardList = null;

		// selectメソッドのテスト
		System.out.println("<< selectメソッドのテスト（すべてのレコードを検索します）>>");
		for (Users card : cardList) {
			System.out.println("ID：" + card.getId());
			System.out.println("ニックネーム：" + card.getName());
			System.out.println("パスワード：" + card.getPassword());
			System.out.println("４ナンバー：" + card.getNumber());
			System.out.println("秘密の質問：" + card.getSecret());
			System.out.println("誕生日：" + card.getBirthday());
			System.out.println("場所：" + card.getLocation());
			System.out.println("飲みべ：" + card.getMotivation());
			System.out.println("アイコン：" + card.getIcon());
			System.out.println("開始時刻：" + card.getStart());
			System.out.println("終了時刻：" + card.getFinish());
			System.out.println("備考：" + card.getRemarks());
			System.out.println("時間：" + card.getTimestamp());
			System.out.println();
		}}
		// insertメソッドのテスト
		int upDelNumber = 0;		// 後で更新および削除する番号
		System.out.println("<< insertメソッドのテスト（1件のレコードを登録します）>>");
		Users insRec = new Users(0, null, null, 0, null, null, null, 0, null, 0, 0, null, null);
		if (dao.insert(insRec)) {
			System.out.println("登録成功！");
			for (Users card : cardList) {
				upDelNumber = card.getId();	// 最後のレコードを後で更新および削除する
			}
		}
		else {
			System.out.println("登録失敗！");
		}
		System.out.println();

		// updateメソッドのテスト
		System.out.println("<< updateメソッドのテスト（1件のレコードを更新します）>>");
		Users upRec = new Users(0, null, null, 0, null, null, null, 0, null, 0, 0, null, null);
		if (dao.update(upRec)) {
			System.out.println("更新成功！");
		}
		else {
			System.out.println("更新失敗！");
		}
		System.out.println();

		// deleteメソッドのテスト
		System.out.println("<< deleteメソッドのテスト（1件のレコードを削除します）>>");
		if (dao.delete(upDelNumber)) {
			System.out.println("削除成功！");
		}
		else {
			System.out.println("削除失敗！");
		}
	}


		//updateIconのテスト
		System.out.println("<< updateメソッドのテスト（1件のレコードを更新します）>>");
			Users upRec = new Users(0, null, null, 0, null, null, null, 0, null, null, null, null, null);
				if (dao.updateIcon(upRec)) {
						System.out.println("更新成功！");
					}
					else {
							System.out.println("更新失敗！");
						}
					System.out.println();}}