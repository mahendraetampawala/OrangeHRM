/**
 * 
 */
package PageObject;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageFactory.LoginLogoutFactory;
import Utility.WebDriverHelper;
import Utility.propertyFileHandler;

/**
 * @author mahen
 *
 */
public class LoginLogoutPO {

	public static LoginLogoutPO NewLoginLogoutpage;
	public static LoginLogoutPO getnnewLoginPO() {
		if(NewLoginLogoutpage==null) {
			NewLoginLogoutpage=new LoginLogoutPO();
		}
		return NewLoginLogoutpage;
	}
	
	public boolean ValidateUsernameAndPwdFields() throws InterruptedException {
		
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutFactory.pf.loginbutton.click();
		Thread.sleep(2000);
	    LoginLogoutFactory.pf.ErrorUsername.isDisplayed();
		
		if( LoginLogoutFactory.pf.ErrorUsername.isDisplayed() && LoginLogoutFactory.pf.ErrorPassword.isDisplayed()) {
			return true;
		}
		return false;
		
		
	}
	
	public boolean loginValidationWithEmptyUsername() {
		
		WebDriverHelper.getWebDriverHelper().implicitwait();

		if(LoginLogoutFactory.pf.ErrorUsername.isDisplayed()) {
			return true;
		}
		return false;
		
		
	}
	
	public boolean loginValidationWithEmptyPassword() {
		
		WebDriverHelper.getWebDriverHelper().implicitwait();
		if(LoginLogoutFactory.pf.ErrorPassword.isDisplayed()) {
			return true;
		}
		return false;
		
	}
	
	public void loginButtonClick() {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutFactory.pf.loginbutton.click();
	}
	
	public void enterpassword(String Password) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutFactory.pf.PasswordField.sendKeys(propertyFileHandler.readProperty(Password));
		System.out.println("The Valid Password is" +Password);
	}
	
	public void enterUsername(String Username) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutFactory.pf.usernameField.sendKeys(propertyFileHandler.readProperty(Username));
		System.out.println("The Valid username is "+Username);
	}
	
	public void enteranInvalidUsername(String InvalidUsername) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutFactory.pf.usernameField.sendKeys(propertyFileHandler.readProperty(InvalidUsername));
	}
	
	public void enterInvalidPassowrd(String InvalidPassword) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutFactory.pf.PasswordField.sendKeys(propertyFileHandler.readProperty(InvalidPassword));
	}
	
	
	public boolean verifyLoginErrorMessage(String loginErrorMsg) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		String error=LoginLogoutFactory.pf.LoginErrorMessage.getAttribute("value");
		if(LoginLogoutFactory.pf.LoginErrorMessage.getAttribute("value")==propertyFileHandler.readProperty(loginErrorMsg)) {
			System.out.println(error);
			return true;
		}
		return false;
	}
	
	public boolean loginValidation() {
		WebDriverHelper.getWebDriverHelper().waitForPageLoad();
		
		if(LoginLogoutFactory.pf.DashboardModuleIcone.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	 
}
