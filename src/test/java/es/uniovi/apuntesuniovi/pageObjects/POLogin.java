package es.uniovi.apuntesuniovi.pageObjects;

import org.openqa.selenium.WebDriver;

import es.uniovi.apuntesuniovi.TestUtil;

public class POLogin extends POAbstract {
	private String username;
	private String password;

	public POLogin(WebDriver driver, TestUtil testUtil, String username, String password) {
		super(driver, testUtil);
		this.username = username;
		this.password = password;
	}

	@Override
	public void run() {
		testUtil.changeWebUrl("http://localhost:4200/");
		testUtil.insertDataInput("username", username);
		testUtil.insertDataInput("password", password);
		testUtil.changeWebClick("logIn");
		testUtil.waitSeconds(5);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
