package test;
import java.util.List;

import dao.CollectionsDao;
import model.Collections;

public class CollectionsDaotest {
	public static void main(String[] args) {
		CollectionsDao dao = new CollectionsDao();
		List<Collections> cardList;

		// selectメソッドのテスト
		System.out.println("<< selectメソッドのテスト（すべてのレコードを検索します）>>");
		cardList = dao.select(new Collections());
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
		System.out.println();

	}
}
