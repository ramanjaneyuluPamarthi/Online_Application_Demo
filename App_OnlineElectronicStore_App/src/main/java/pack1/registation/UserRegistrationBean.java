package pack1.registation;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserRegistrationBean implements Serializable
{
	private String name,pwd,mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public UserRegistrationBean() {}

}
