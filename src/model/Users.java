package model;

import java.io.Serializable;

public class Users implements Serializable {

	private int id;
	private String name;
	private int password;
	private int number;
	private String secret;
	private int birthday; 		/*ここどうすればいいんだっけ*/
	private String  location;	/*プルダウンの変換*/
	private int	 motivation;
	private String icon;
	private int start;
	private int finish;
	private String remarks;

	public Users(int id, String name, int password, int number, String secret, int birthday, String location,
			int motivation, String icon, int start, int finish, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.number = number;
		this.secret = secret;
		this.birthday = birthday;
		this.location = location;
		this.motivation = motivation;
		this.icon = icon;
		this.start = start;
		this.finish = finish;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMotivation() {
		return motivation;
	}

	public void setMotivation(int motivation) {
		this.motivation = motivation;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getFinish() {
		return finish;
	}

	public void setFinish(int finish) {
		this.finish = finish;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


}
