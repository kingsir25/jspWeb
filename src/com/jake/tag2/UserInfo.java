package com.jake.tag2;

public class UserInfo {
	
	private String userName;
	private String birthday;
	private String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", birthday=" + birthday + ", email=" + email + "]";
	}
	

}
