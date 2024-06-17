package test;
import java.util.List;

import dao.ItemsDAO;
import model.Items;

public class ItemsDAOtest {
	public static void main(String[] args) {
		ItemsDAO dao = new ItemsDAO();
		List<Items> cardList = null;

		// insertメソッドのテスト
		int upDelNumber = 0;		// 後で更新および削除する番号
		System.out.println("<< insertメソッドのテスト（1件のレコードを登録します）>>");
		Items insRec = new Items( 0, 0, "挿入", "挿入", "挿入");
		try {
			if (dao.insert(insRec)) {
				System.out.println("登録成功！");

				for (Items card : cardList) {
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
		Items upRec = new Items(0, 0, "更新", "更新", "更新");
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
