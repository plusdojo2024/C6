package test;
import java.util.List;

import dao.FriendsDAO;
import model.Friends;

public class FriendsDAOtest {
	public static void main(String[] args) {
		FriendsDAO dao = new FriendsDAO();
		List<Friends> cardList = null;

		// selectメソッドのテスト
		System.out.println("<< selectメソッドのテスト（すべてのレコードを検索します）>>");
		for (Friends card : cardList) {
			System.out.println("お気に入りID：" + card.getId());
			System.out.println("ユーザーID：" + card.getUsers_id());
			System.out.println("フレンドID：" + card.getFriends_id());
			System.out.println("hidden：" + card.getHidden());
			System.out.println("favorite：" + card.getFavorite());
			System.out.println();
		}

		// insertメソッドのテスト
		int upDelNumber = 0;		// 後で更新および削除する番号
		System.out.println("<< insertメソッドのテスト（1件のレコードを登録します）>>");
		Friends insRec = new Friends(0, 0, 0, 0, 0);
		try {
			if (dao.insert(insRec)) {
				System.out.println("登録成功！");
				for (Friends card : cardList) {
					upDelNumber = card.getId();	// 最後のレコードを後で更新および削除する
				}
			}
			else {
				System.out.println("登録失敗！");
			}
		} catch (Exception e2) {
			// TODO 自動生成された catch ブロック
			e2.printStackTrace();
		}
		System.out.println();


		// updateメソッドのテスト
		System.out.println("<< updateメソッドのテスト（1件のレコードを更新します）>>");
		Friends upRec = new Friends(0, 0, 0, 0, 0);
		try {
			if (dao.update(upRec)) {
				System.out.println("更新成功！");
			}
			else {
				System.out.println("更新失敗！");
			}
		} catch (Exception e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
		System.out.println();

		// deleteメソッドのテスト
		System.out.println("<< deleteメソッドのテスト（1件のレコードを削除します）>>");
		try {
			if (dao.delete(upDelNumber)) {
				System.out.println("削除成功！");
			}
			else {
				System.out.println("削除失敗！");
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
