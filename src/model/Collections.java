package model;

import java.io.Serializable;

public class Collections implements Serializable {
	private int id; 		/* コレクションid */
	private int users_id;	/* ユーザーid */
	private int items_id;	/* アイテムid */


	public Collections(int id, int users_id, int items_id) {
		super();
		this.id = id;
		this.users_id = users_id;
		this.items_id = items_id;
	}





	public Collections() {
		// TODO 自動生成されたコンストラクター・スタブ
	}





	//↓↓getterおよびsetterの生成（自動生成）
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUsers_id() {
		return users_id;
	}


	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}


	public int getItems_id() {
		return items_id;
	}


	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}




}
