/**
 * 
 */
package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utility.WebDriverHelper;

/**
 * @author mahen
 *
 */
public class LoginLogoutFactory {

	
	public static LoginLogoutFactory pf= PageFactory.initElements(WebDriverHelper.getDriver(), LoginLogoutFactory.class);
	
	@FindBy(how =How.XPATH, using="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginbutton;
	
	
	
}
