package es.uniovi.apuntesuniovi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.uniovi.apuntesuniovi.pageObjects.POLogin;

public class LoginTest extends AbstractTest {
	private String title = "Error al identificarse";
	private String content = "Por favor compruebe sus credenciales";

	@Test
	void onSuccess() {
		POLogin login = new POLogin(driver, testUtil, "admin", "admin");
		login.run();
		testUtil.textPresent("Identificarse", false);
	}

	@Test
	void wrongPassword() {
		POLogin login = new POLogin(driver, testUtil, "noUser", "WrongPassword");
		login.run();
		closeAndGetSweetAlert();
		assertEquals(sweetAlert.getTitle(), title);
		assertEquals(sweetAlert.getContent(), content);
		testFailLogin();
	}

	@Test
	void wrongUser() {
		POLogin login = new POLogin(driver, testUtil, "noExists", "noUser");
		login.run();
		closeAndGetSweetAlert();
		assertEquals(sweetAlert.getTitle(), title);
		assertEquals(sweetAlert.getContent(), content);
		testFailLogin();
	}

	private void testFailLogin() {
		testUtil.textPresent("Identificarse", true);
		testUtil.textPresent("Cerrar sesión", false);
	}

}
