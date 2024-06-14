package test;
import java.util.List;

import dao.ItemsDao;
import model.Items;

public class ItemsDAOtest {
	public static void main(String[] args) {
		ItemsDao dao = new ItemsDao();
		List<Items> cardList;

		// insertメソッドのテスト
		int upDelNumber = 0;		// 後で更新および削除する番号
		System.out.println("<< insertメソッドのテスト（1件のレコードを登録します）>>");
		Items insRec = new Items( 0, 0, "挿入", "挿入", "挿入");
		if (dao.insert(insRec)) {
			System.out.println("登録成功！");

			for (Items card : cardList) {
				upDelNumber = card.getId();	// 最後のレコードを後で更新および削除する
			}
		}
		else {
			System.out.println("登録失敗！");
		}
		System.out.println();


		// updateメソッドのテスト
		System.out.println("<< updateメソッドのテスト（1件のレコードを更新します）>>");
		Items upRec = new Items(0, 0, "更新", "更新", "更新");
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
}
