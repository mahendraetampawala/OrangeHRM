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
	
	public void loginButtonClick() {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutFactory.pf.loginbutton.click();
	}
	
	public void enterpassword(String pwd) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		LoginLogoutFactory.pf.ErrorPassword.sendKeys(pwd);
	}
	
}
