package test;
import java.util.List;

import dao.CollectionsDAO;
import model.Collections;

public class CollectionsDaotest {
	public static void main(String[] args) {
		CollectionsDAO dao = new CollectionsDAO();
		List<Collections> cardList = null;

		// selectメソッドのテスト
		System.out.println("<< selectメソッドのテスト（すべてのレコードを検索します）>>");
		for (Collections card : cardList) {
			System.out.println("コレクションID：" + card.getId());
			System.out.println("ユーザーID：" + card.getUsers_id());
			System.out.println("アイテムID：" + card.getItems_id());
			System.out.println();
		}

		// insertメソッドのテスト
		int upDelNumber = 0;		// 後で更新および削除する番号
		System.out.println("<< insertメソッドのテスト（1件のレコードを登録します）>>");
		Collections insRec = new Collections(0, 0, 0);
		try {
			if (dao.insert(insRec)) {
				System.out.println("登録成功！");
				cardList = dao.select(insRec);
				for (Collections card : cardList) {
					upDelNumber = card.getUsers_id();	// 最後のレコードを後で更新および削除する
				}
			}
			else {
				System.out.println("登録失敗！");
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println();

	}
}
