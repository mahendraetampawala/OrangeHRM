/**
 * 
 */
package PageObject;

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
	
	public void clickonLoginButton() {
		LoginLogoutFactory.pf.loginbutton.click();
	}
	
}
