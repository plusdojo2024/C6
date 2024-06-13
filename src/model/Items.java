package model;

import java.io.Serializable;

public class Items implements Serializable {
	private int id;
	private int types_id;
	private String label; /*BLOBを変換できなかった..*/
	private String name;
	private String memo;
	public Items(int id, int types_id, String label, String name, String memo) {
		super();
		this.id = id;
		this.types_id = types_id;
		this.label = label;
		this.name = name;
		this.memo = memo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTypes_id() {
		return types_id;
	}
	public void setTypes_id(int types_id) {
		this.types_id = types_id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}



}
