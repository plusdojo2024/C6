package model;

import java.io.Serializable;

public class Friends implements Serializable {
	private int id;
	private int users_id;
	private int friends_id;
	private boolean hidden;/* bitをboolean型に変換 */
	private boolean favorite; /* bitをboolean型に変換 */


	public Friends(int id, int users_id, int friends_id, boolean hidden, boolean favorite) {
		super();
		this.id = id;
		this.users_id = users_id;
		this.friends_id = friends_id;
		this.hidden = hidden;
		this.favorite = favorite;
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


	public int getFriends_id() {
		return friends_id;
	}


	public void setFriends_id(int friends_id) {
		this.friends_id = friends_id;
	}


	public boolean getHidden() {
		return hidden;
	}


	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}


	public boolean getFavorite() {
		return favorite;
	}


	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}








}
